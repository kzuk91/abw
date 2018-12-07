package opl.com.abw.service;

import opl.com.abw.entity.Endpoint;

import java.util.List;

public interface EndpointService {
    List<Endpoint> getAllEndpoints();

    Endpoint getEndpointById(int endpointId);

    boolean addEndpoint(Endpoint endpoint);

    void updateEndpoint(Endpoint endpoint);

    void deleteEndpoint(int endpointId);

    Endpoint getEndpointByName(String name);
}
