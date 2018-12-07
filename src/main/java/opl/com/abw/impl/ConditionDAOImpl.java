package opl.com.abw.impl;


import opl.com.abw.dao.ConditionDAO;
import opl.com.abw.entity.Condition;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class ConditionDAOImpl implements ConditionDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Condition> getAllConditions() {
        String hql = "FROM Condition as condition ORDER BY condition.conditionId";
        List<Condition> conditionsList = (List<Condition>) entityManager.createQuery(hql).getResultList();
        if (conditionsList.isEmpty()) return Collections.emptyList();
        return conditionsList;
    }

    @Override
    public Condition getConditionById(int conditionId) {
        return entityManager.find(Condition.class, conditionId);
    }

    @Override
    public void addCondition(Condition condition) {
        entityManager.persist(condition);
    }

    @Override
    public void updateCondition(Condition condition) {
        Condition cnd = getConditionById(condition.getConditionId());
        cnd.setDescription(condition.getDescription());
        cnd.setName(condition.getName());
        cnd.setValue(condition.getValue());
        cnd.setModifiedDate(new Date());
        cnd.setFact(condition.getFact());
        cnd.setQuestion(condition.getQuestion());
        entityManager.flush();
    }

    @Override
    public void deleteCondition(int conditionId) {
        entityManager.remove(getConditionById(conditionId));
    }

    @Override
    public boolean conditionExists(String name) {
        String hql = "FROM Condition as condition WHERE condition.name = :name";
        int count = entityManager.createQuery(hql).setParameter("name", name).getResultList().size();
        return count > 0;
    }
}
