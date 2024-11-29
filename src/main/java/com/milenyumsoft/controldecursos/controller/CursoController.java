package com.milenyumsoft.controldecursos.controller;

import com.milenyumsoft.controldecursos.model.Curso;
import com.milenyumsoft.controldecursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    //1.- Crear un nuevo curso

    @PostMapping("curso/crear")
    public String createCurso(@RequestBody Curso curso) {

        cursoService.createCurso(curso);
        return "Curso creado, exitosamente";
    }

    @PutMapping("curso/editar")
    public Curso editCurso(@RequestBody Curso curso) {

        Curso cur = cursoService.updateCurso(curso);
        System.out.println("Curso editado exitosamente");
        return cur;
    }

    @GetMapping("cursos/traer")
    public List<Curso> traerCursos() {

        return cursoService.getCursos();
    }

    @GetMapping("curso/traer")
    public Curso traerCurso(@RequestParam Long id) {
       Curso cur= cursoService.getCurso(id);
        return cur;
    }

    @GetMapping("cursos/traerjava")
    public List<Curso> traerCursos1() {

        List<Curso> listaCurso = cursoService.getCursos();
        List<Curso> listaCursosJava = new ArrayList<>();
        for(Curso curso : listaCurso) {

            if( curso.getNombre().toLowerCase().contains("java") ==true) {

                listaCursosJava.add(curso);
            }

        }

        return listaCursosJava;
    }



}
