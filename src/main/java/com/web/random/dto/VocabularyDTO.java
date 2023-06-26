package com.web.random.dto;

import lombok.Data;

@Data
public class VocabularyDTO {
    private String vietNam;
    private String romaji;
    private String japanese;
    private Integer lesson;

    public VocabularyDTO(String vietNam, String japanese, Integer lesson) {
        this.vietNam = vietNam;
        this.japanese = japanese;
        this.lesson = lesson;
    }
}
