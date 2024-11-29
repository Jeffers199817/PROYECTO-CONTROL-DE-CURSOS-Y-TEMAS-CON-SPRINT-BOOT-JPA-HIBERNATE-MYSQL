package com.milenyumsoft.controldecursos.controller;

import com.milenyumsoft.controldecursos.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    private TemaService temaService;


}
