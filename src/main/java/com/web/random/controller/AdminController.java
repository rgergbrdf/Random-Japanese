package com.web.random.controller;

import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final VocabularyService service;

    @GetMapping("")
    public String getAdmin(){
        return "admin";
    }
    @GetMapping("/vocabularies")
    public String getVocabularies(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                  Model model){
        Page<Vocabulary> vocabularies = service.findAll(page);
        model.addAttribute("totalPages", vocabularies.getTotalPages());
        model.addAttribute("currentPage", page);
        model.addAttribute("vocabularies", vocabularies.getContent());
        return "vocabularies";
    }

    @GetMapping("/vocabularies/{lesson}")
    public String getVocabulariesByLesson(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                  @PathVariable("lesson") Integer lesson,
                                  Model model){
        Page<Vocabulary> vocabularies = service.findByLesson(page, lesson);
        model.addAttribute("totalPages", vocabularies.getTotalPages());
        model.addAttribute("currentPage", page);
        model.addAttribute("vocabularies", vocabularies.getContent());
        return "vocabularies";
    }

    @PostMapping("/add-vocabulary")
    @ResponseBody
    public void addVocabulary(@ModelAttribute VocabularyDTO vocabularyDTO){
        service.add(vocabularyDTO);
    }
}
