package com.web.random.repository;

import com.web.random.entity.Vocabulary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VocabularyRepository extends JpaRepository<Vocabulary, Integer> {

    List<Vocabulary> findByLesson(Integer lesson);

    Page<Vocabulary> findByLesson(Pageable page, Integer lesson);
}
