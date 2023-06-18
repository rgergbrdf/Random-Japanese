package com.web.random.service;

import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VocabularyService {
    void add(VocabularyDTO vocabularyDTO);

    List<Vocabulary> findByLesson(Integer lesson);

}
