package com.example.cw3question.service.impl;

import com.example.cw3question.model.Question;
import com.example.cw3question.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {

    private Set<Question> questionsSet = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
//        Реализовать сервис JavaQuestionService, который будет реализовывать QuestionService и хранить в себе список вопросов по Java
//        судя по схеме должен быть Set, не понимаю, как тогда сохранить в сет String question, String answer
//        И для чего два метода add(String question, String answer) и add(Question question) ?
        Map<String, String> questionMap = new HashMap<>();
        if (question != null && !question.isEmpty() && answer != null && !answer.isEmpty()) {
            return questionMap.put(question, answer);
        } else {
            throw new IllegalArgumentException();
        }
        return null;  // Не пойму как вернуть запрошенный в методе тип данных Question
    }

    @Override
    public Question add(Question question) {
        if (question != null) {
            questionsSet.add(question);
        } else {
            throw new IllegalArgumentException();
        }
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (question != null) {
            questionsSet.remove(question);
        } else {
            throw new IllegalArgumentException();
        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questionsSet;
    }

    @Override
//    Реализация метода getRandomQuestion осуществляется с помощью класса Random и его метода nextInt,
//    который в качестве параметра принимает максимальное число, а затем возвращает вам результат в виде случайного числа
//    от 0 до максимального числа из параметров (не включительно).
//    Т к не знаю из какого списка брать Question, не могу реализовать логику
    public Question getRandomQuestion(int maxInt) {
        Random random = new Random();
        int number = random.nextInt(maxInt)+1;
        questionsSet.
        return;
    }
}
