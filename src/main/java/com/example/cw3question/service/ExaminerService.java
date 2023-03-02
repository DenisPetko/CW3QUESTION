package com.example.cw3question.service;

import com.example.cw3question.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
