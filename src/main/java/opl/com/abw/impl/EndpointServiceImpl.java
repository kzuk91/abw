package opl.com.abw.impl;

import opl.com.abw.dao.EndpointDAO;
import opl.com.abw.entity.Endpoint;
import opl.com.abw.service.EndpointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndpointServiceImpl implements EndpointService {

    private final EndpointDAO endpointDAO;

    @Autowired
    public EndpointServiceImpl(EndpointDAO endpointDAO) {
        this.endpointDAO = endpointDAO;
    }

    @Override
    public List<opl.com.abw.entity.Endpoint> getAllEndpoints() {
        return endpointDAO.getAllEndpoints();
    }

    @Override
    public opl.com.abw.entity.Endpoint getEndpointById(int endpointId) {
        return endpointDAO.getEndpointById(endpointId);
    }

    @Override
    public synchronized boolean addEndpoint(opl.com.abw.entity.Endpoint endpoint) {
        if (endpointDAO.endpointExists(endpoint.getName())) {
            return false;
        } else {
            endpointDAO.addEndpoint(endpoint);
            return true;
        }
    }

    @Override
    public void updateEndpoint(opl.com.abw.entity.Endpoint endpoint) {
        endpointDAO.updateEndpoint(endpoint);
    }

    @Override
    public void deleteEndpoint(int endpointId) {
        endpointDAO.deleteEndpoint(endpointId);
    }

    @Override
    public Endpoint getEndpointByName(String name) {
        return endpointDAO.getEndpointByName(name);
    }
}
