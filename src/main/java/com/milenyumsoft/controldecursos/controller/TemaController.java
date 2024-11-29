package com.milenyumsoft.controldecursos.controller;

import com.milenyumsoft.controldecursos.model.Tema;
import com.milenyumsoft.controldecursos.service.ITemaService;
import com.milenyumsoft.controldecursos.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    private ITemaService temaService;


    //Crear tema
    @PostMapping("tema/crear")
    public String crearTema(@RequestBody Tema tema) {
        temaService.saveTema(tema);
        return "Tema creada, exitosamente";
    }
}
