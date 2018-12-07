package opl.com.abw.impl;

import opl.com.abw.dao.ConditionDAO;
import opl.com.abw.entity.Condition;
import opl.com.abw.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionServiceImpl implements ConditionService {

    private final ConditionDAO conditionDAO;

    @Autowired
    public ConditionServiceImpl(ConditionDAO conditionDAO) {
        this.conditionDAO = conditionDAO;
    }

    @Override
    public List<Condition> getAllConditions() {
        return conditionDAO.getAllConditions();
    }

    @Override
    public Condition getConditionById(int conditionId) {
        return conditionDAO.getConditionById(conditionId);
    }

    @Override
    public synchronized boolean addCondition(Condition condition) {
        if (conditionDAO.conditionExists(condition.getName())) {
            return false;
        } else {
            conditionDAO.addCondition(condition);
            return true;
        }
    }

    @Override
    public void updateCondition(Condition condition) {
        conditionDAO.updateCondition(condition);
    }

    @Override
    public void deleteCondition(int conditionId) {
        conditionDAO.deleteCondition(conditionId);
    }
}
