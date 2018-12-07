package opl.com.abw.dao;

import opl.com.abw.entity.Fact;

import java.util.List;

public interface FactDAO {
    List<Fact> getAllFacts();

    Fact getFactById(int factId);

    void addFact(Fact fact);

    void updateFact(Fact fact);

    void deleteFact(int factId);

    boolean factExists(String name);
}
