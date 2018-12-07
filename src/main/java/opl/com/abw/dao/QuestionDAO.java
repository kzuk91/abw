package opl.com.abw.dao;

import opl.com.abw.entity.Question;

import java.util.List;

public interface QuestionDAO {
    List<Question> getAllQuestions();

    Question getQuestionById(int questionId);

    void addQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(int questionId);

    boolean questionExists(String name);
}
