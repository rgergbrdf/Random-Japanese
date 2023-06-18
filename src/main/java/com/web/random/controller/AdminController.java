package com.web.random.controller;

import com.web.random.dto.VocabularyDTO;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final VocabularyService service;

    @GetMapping("")
    public String getAdmin(){
        return "admin";
    }

    @PostMapping("/add-vocabulary")
    @ResponseBody
    public void addVocabulary(@ModelAttribute VocabularyDTO vocabularyDTO){
        service.add(vocabularyDTO);
    }
}
