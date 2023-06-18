package com.web.random.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vocabulary")
@Data
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
}
