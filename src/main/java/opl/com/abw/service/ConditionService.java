package opl.com.abw.service;

import opl.com.abw.entity.Condition;

import java.util.List;

public interface ConditionService {
    List<Condition> getAllConditions();

    Condition getConditionById(int conditionId);

    boolean addCondition(Condition condition);

    void updateCondition(Condition condition);

    void deleteCondition(int conditionId);
}
