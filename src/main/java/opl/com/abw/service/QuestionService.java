package opl.com.abw.service;

import opl.com.abw.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();

    Question getQuestionById(int questionId);

    boolean addQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestion(int questionId);
}
