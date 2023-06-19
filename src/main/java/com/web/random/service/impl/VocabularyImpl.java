package com.web.random.service.impl;

import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import com.web.random.repository.VocabularyRepository;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
        return repository.findByLesson(lesson);
    }

    @Override
    public Page<Vocabulary> findByLesson(Integer page, Integer lesson) {
        Pageable pageable = PageRequest.of(page - 1 , Integer.MAX_VALUE);
        return repository.findByLesson(pageable, lesson);
    }

    @Override
    public Page<Vocabulary> findAll(Integer page) {
        Pageable pageable = PageRequest.of(page - 1 , 10);
        return repository.findAll(pageable);
    }
}
