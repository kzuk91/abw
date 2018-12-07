package opl.com.abw.impl;


import opl.com.abw.dao.QuestionDAO;
import opl.com.abw.entity.Question;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Transactional
@Repository
public class QuestionDAOImpl implements QuestionDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Question> getAllQuestions() {
        String hql = "FROM Question as question ORDER BY question.questionId";
        List<Question> questionsList = (List<Question>) entityManager.createQuery(hql).getResultList();
        if (questionsList.isEmpty()) return Collections.emptyList();
        return questionsList;
    }

    @Override
    public Question getQuestionById(int questionId) {
        return entityManager.find(Question.class, questionId);
    }

    @Override
    public void addQuestion(Question question) {
        entityManager.persist(question);
    }

    @Override
    public void updateQuestion(Question question) {
        Question qst = getQuestionById(question.getQuestionId());
        qst.setPositiveValue(question.getPositiveValue());
        qst.setNegativeValue(question.getNegativeValue());
        qst.setName(question.getName());
        qst.setModifiedDate(new Date());
        qst.setConditions(question.getConditions());
        entityManager.flush();
    }

    @Override
    public void deleteQuestion(int questionId) {
        entityManager.remove(getQuestionById(questionId));
    }

    @Override
    public boolean questionExists(String name) {
        String hql = "FROM Question as question WHERE question.name = :name";
        int count = entityManager.createQuery(hql).setParameter("name", name).getResultList().size();
        return count > 0;
    }
}
