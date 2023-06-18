package com.web.random.service.impl;

import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import com.web.random.repository.VocabularyRepository;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VocabularyImpl implements VocabularyService {

    private final VocabularyRepository repository;
    private final ModelMapper modelMapper;
    @Override
    public void add(VocabularyDTO vocabularyDTO) {
        Vocabulary vocabulary = new Vocabulary();
        modelMapper.map(vocabularyDTO, vocabulary);
        repository.save(vocabulary);
    }

    @Override
    public List<Vocabulary> findByLesson(Integer lesson) {
        List<Vocabulary> vocabularies = repository.findByLesson(lesson);
        return vocabularies;
    }
}
