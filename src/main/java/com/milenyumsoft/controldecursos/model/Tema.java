package com.milenyumsoft.controldecursos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@SequenceGenerator(name="global_seq", sequenceName = "hibernate_seq",allocationSize = 1)
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Long id_tema;
    private String nombre;
    private String descripcion;
}
