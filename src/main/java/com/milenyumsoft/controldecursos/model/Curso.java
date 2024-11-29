package com.milenyumsoft.controldecursos.model;


import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@SequenceGenerator(name="global_seq", sequenceName = "hibernate_seq", allocationSize = 1)
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;

    @OneToMany
    private List<Tema> listaTemas;
}
