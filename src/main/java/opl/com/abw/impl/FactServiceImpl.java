package opl.com.abw.impl;

import opl.com.abw.dao.FactDAO;
import opl.com.abw.entity.Fact;
import opl.com.abw.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactServiceImpl implements FactService {

    private final FactDAO factDAO;

    @Autowired
    public FactServiceImpl(FactDAO factDAO) {
        this.factDAO = factDAO;
    }

    @Override
    public List<Fact> getAllFacts() {
        return factDAO.getAllFacts();
    }

    @Override
    public Fact getFactById(int factId) {
        return factDAO.getFactById(factId);
    }

    @Override
    public synchronized boolean addFact(Fact fact) {
        if (factDAO.factExists(fact.getName())) {
            return false;
        } else {
            factDAO.addFact(fact);
            return true;
        }
    }

    @Override
    public void updateFact(Fact fact) {
        factDAO.updateFact(fact);
    }

    @Override
    public void deleteFact(int factId) {
        factDAO.deleteFact(factId);
    }
}
