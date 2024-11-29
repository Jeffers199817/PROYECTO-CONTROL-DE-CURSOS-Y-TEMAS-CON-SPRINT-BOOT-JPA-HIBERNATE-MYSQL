package com.milenyumsoft.controldecursos.controller;

import com.milenyumsoft.controldecursos.model.Curso;
import com.milenyumsoft.controldecursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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


}
