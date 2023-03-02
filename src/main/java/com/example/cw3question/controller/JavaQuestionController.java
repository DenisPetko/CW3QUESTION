package com.example.cw3question.controller;

import com.example.cw3question.model.Question;
import com.example.cw3question.service.QuestionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
@Tag(name = "API по работе с вопросами", description = "Операции для работы с вопросами")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/add?question=QuestionText&answer=QuestionAnswer")
    @Operation(summary = "Добавить вопрос")
    public Question addQuestion(@RequestBody String question, @RequestBody String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/find")
    @Operation(summary = "Получить все вопросы")
    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }

    @DeleteMapping("/remove?question=QuestionText&answer=QuestionAnswer")
    @Operation(summary = "Удалить вопрос")
    public Question removeQuestion(String question, String answer) {

    }
}
