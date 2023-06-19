package com.web.random.controller;


import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import com.web.random.repository.VocabularyRepository;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class VocabularyController {
    private List<Vocabulary> vocabularies = new ArrayList<>();

    private Random randomGenerator = new Random();
    private final VocabularyService service;

    @GetMapping("/vocabulary")
    public String getVocabulary(Model model){
        Vocabulary vocabulary = null;
        model.addAttribute("vocabulary", vocabulary);
        return "vocabulary";
    }


    @GetMapping("/vocabulary/{lesson}")
    public String getByLesson(@PathVariable("lesson") Integer lesson, Model model){
        vocabularies = service.findByLesson(lesson);
        Vocabulary vocabulary = anyItem();
        model.addAttribute("vocabulary", vocabulary);
        return "vocabulary";

    }

    @GetMapping("/random-vocabulary")
    public String getRandomVocabulary(Model model){
        Vocabulary vocabulary = anyItem();
        model.addAttribute("vocabulary", vocabulary);
        return "vocabulary";
    }


    public Vocabulary anyItem()
    {
        int index = randomGenerator.nextInt(vocabularies.size());
        return vocabularies.get(index);
    }

}
