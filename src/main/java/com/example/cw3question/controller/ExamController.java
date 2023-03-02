package com.example.cw3question.controller;

import com.example.cw3question.model.Question;
import com.example.cw3question.service.ExaminerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
@Tag(name = "API по работе с вопросами", description = "Получение всех вопросов")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/")
    @Operation(summary = "Получить все вопросы")
    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }


}
