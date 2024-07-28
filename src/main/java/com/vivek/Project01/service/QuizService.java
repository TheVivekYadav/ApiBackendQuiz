package com.vivek.Project01.service;


import com.vivek.Project01.model.Quiz;
import com.vivek.Project01.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepository repository;

    public Quiz addQuestionAnswer(Quiz quiz){
        return repository.save(quiz);
    }

    public List<Quiz> getAllQuestionAnswers(){
        return repository.findAll();
    }

    public Optional<Quiz> getQuestionAnswerById(int id){
        return Optional.of(repository.findById(id).orElse(new Quiz()));
    }


}
