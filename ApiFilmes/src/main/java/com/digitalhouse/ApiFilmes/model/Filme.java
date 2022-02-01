package com.digitalhouse.ApiFilmes.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Id
    private Integer id;

    @Getter
    @Setter
    private String titulo;

    @Getter
    @Setter
    private String descricao;

    @Getter
    @Setter
    private String urlImg;




}
