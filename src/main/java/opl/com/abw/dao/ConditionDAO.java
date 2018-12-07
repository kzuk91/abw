package opl.com.abw.dao;

import opl.com.abw.entity.Condition;

import java.util.List;

public interface ConditionDAO {
    List<Condition> getAllConditions();

    Condition getConditionById(int conditionId);

    void addCondition(Condition condition);

    void updateCondition(Condition condition);

    void deleteCondition(int conditionId);

    boolean conditionExists(String name);
}
