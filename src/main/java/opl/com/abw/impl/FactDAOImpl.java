package opl.com.abw.impl;


import opl.com.abw.dao.FactDAO;
import opl.com.abw.entity.Fact;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class FactDAOImpl implements FactDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Fact> getAllFacts() {
        String hql = "FROM Facts as fact ORDER BY fact.factId";
        List<Fact> factsList = (List<Fact>) entityManager.createQuery(hql).getResultList();
        if (factsList.isEmpty()) return Collections.emptyList();
        return factsList;
    }

    @Override
    public Fact getFactById(int newFactId) {
        return entityManager.find(Fact.class, newFactId);
    }

    @Override
    public void addFact(Fact newFact) {
        entityManager.persist(newFact);
    }

    @Override
    public void updateFact(Fact newFact) {
        Fact fact = getFactById(newFact.getFactId());
        fact.setValue(newFact.getValue());
        fact.setName(newFact.getName());
        fact.setModifiedDate(new Date());
        fact.setTags(newFact.getTags());
        fact.setEndpoint(newFact.getEndpoint());
        entityManager.flush();
    }

    @Override
    public void deleteFact(int factId) {
        entityManager.remove(getFactById(factId));
    }

    @Override
    public boolean factExists(String name) {
        String hql = "FROM Fact as fact WHERE fact.name = :name";
        int count = entityManager.createQuery(hql).setParameter("name", name).getResultList().size();
        return count > 0;
    }
}
