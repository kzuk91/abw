package opl.com.abw.impl;


import opl.com.abw.dao.EndpointDAO;
import opl.com.abw.entity.Endpoint;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class EndpointDAOImpl implements EndpointDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Endpoint> getAllEndpoints() {
        String hql = "FROM Endpoint as ep ORDER BY ep.endpointId";
        List<Endpoint> epsList = (List<Endpoint>) entityManager.createQuery(hql).getResultList();
        if (epsList.isEmpty()) return Collections.emptyList();
        return epsList;
    }

    @Override
    public Endpoint getEndpointById(int epId) {
        return entityManager.find(Endpoint.class, epId);
    }

    @Override
    public void addEndpoint(Endpoint ep) {
        entityManager.persist(ep);
    }

    @Override
    public void updateEndpoint(Endpoint ep) {
        Endpoint endpoint = getEndpointById(ep.getEndpointId());
        endpoint.setAddress(ep.getAddress());
        endpoint.setDescription(ep.getDescription());
        endpoint.setName(ep.getName());
        endpoint.setModifiedDate(new Date());
        endpoint.setFacts(ep.getFacts());
        entityManager.flush();
    }

    @Override
    public void deleteEndpoint(int epId) {
        entityManager.remove(getEndpointById(epId));
    }

    @Override
    public boolean endpointExists(String name) {
        String hql = "FROM Endpoint as ep WHERE ep.name = :name";
        int count = entityManager.createQuery(hql).setParameter(1, name).getResultList().size();
        return count > 0;
    }

    @Override
    public Endpoint getEndpointByName(String name) {
        String hql = "FROM Endpoint WHERE name = :name";
        List<Endpoint> epsList = (List<Endpoint>) entityManager.createQuery(hql).setParameter("name", name).getResultList();
        Endpoint ep = epsList.get(0);
        //if (Objects.isNull(ep)) return new Endpoint();
        return ep;
    }


}
