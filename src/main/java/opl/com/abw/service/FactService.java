package opl.com.abw.service;

import opl.com.abw.entity.Fact;

import java.util.List;

public interface FactService {
    List<Fact> getAllFacts();

    Fact getFactById(int factId);

    boolean addFact(Fact fact);

    void updateFact(Fact fact);

    void deleteFact(int factId);
}
