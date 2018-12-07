package opl.com.abw.impl;

import opl.com.abw.dao.QuestionDAO;
import opl.com.abw.entity.Question;
import opl.com.abw.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDAO questionDAO;

    @Autowired
    public QuestionServiceImpl(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionDAO.getAllQuestions();
    }

    @Override
    public Question getQuestionById(int tagId) {
        return questionDAO.getQuestionById(tagId);
    }

    @Override
    public synchronized boolean addQuestion(Question tag) {
        if (questionDAO.questionExists(tag.getName())) {
            return false;
        } else {
            questionDAO.addQuestion(tag);
            return true;
        }
    }

    @Override
    public void updateQuestion(Question tag) {
        questionDAO.updateQuestion(tag);
    }

    @Override
    public void deleteQuestion(int tagId) {
        questionDAO.deleteQuestion(tagId);
    }
}
