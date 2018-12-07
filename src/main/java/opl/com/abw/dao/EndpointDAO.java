package opl.com.abw.dao;

import opl.com.abw.entity.Endpoint;

import java.util.List;

public interface EndpointDAO {
    List<Endpoint> getAllEndpoints();

    Endpoint getEndpointById(int endpointId);

    void addEndpoint(Endpoint endpoint);

    void updateEndpoint(Endpoint endpoint);

    void deleteEndpoint(int endpointId);

    boolean endpointExists(String name);

    Endpoint getEndpointByName(String name);
}
