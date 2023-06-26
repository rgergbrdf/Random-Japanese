package com.web.random.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vocabulary")
@Data
@NoArgsConstructor
public class Vocabulary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "viet_nam")
    private String vietNam;

    @Column(name = "romaji")
    private String romaji;

    @Column(name = "japanese")
    private String japanese;

    @Column(name = "lesson")
    private Integer lesson;

    public Vocabulary(String vietNam, String japanese, Integer lesson) {
        this.vietNam = vietNam;
        this.japanese = japanese;
        this.lesson = lesson;
    }


}
