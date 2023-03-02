package com.example.cw3question.service;

import com.example.cw3question.model.Question;

import java.util.Collection;

/**
 * Сервис по работе с вопросами определенного предмета
 */
public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion(int maxInt);
}
