package com.example.cw3question.service.impl;

import com.example.cw3question.model.Question;
import com.example.cw3question.service.ExaminerService;
import com.example.cw3question.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
@AllArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {

    private Random random;
    private QuestionService questionService;

    @Override
    public Collection<Question> getQuestions(int amount) {
//        Этот интерфейс ExaminerService должен содержать один метод, который вернет список вопросов.
//        Тут по Set<Question> questionsSet пройтись надо и искать по индексу какому-то ?
        return null;
    }
}
