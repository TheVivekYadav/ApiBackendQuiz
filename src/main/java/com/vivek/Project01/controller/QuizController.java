package com.vivek.Project01.controller;

import com.vivek.Project01.model.Quiz;
import com.vivek.Project01.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions")
public class QuizController {

    @Autowired
    private QuizService service;

    @GetMapping
    public List<Quiz> getAllQuestionAnswer(){
        return service.getAllQuestionAnswers();
    }

    @PostMapping
    public Quiz addQuestionAnswer(@RequestBody Quiz quiz){
        return service.addQuestionAnswer(quiz);
    }

    @GetMapping("/{id}")
    public Optional<Quiz> getQuestionAnswerById(@PathVariable int id){
        return service.getQuestionAnswerById(id);
    }

}
