package com.tecback.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_documentario")

public class Documentario {
    @Id
    @GeneratedValue
    private long id;
    private String titulo;
    @Column(length = 500)
    private String sinopse;
}
