package com.milenyumsoft.controldecursos.service;

import com.milenyumsoft.controldecursos.model.Curso;

import java.util.List;

public interface ICursoService {


    public List<Curso> getCursos();

    public Curso getCurso(Long id);

    public void createCurso(Curso curso);

    public void deleteCurso(Long id);

    public Curso updateCurso(Curso curso);

    public Curso updateCurso(Long idOriginal, Long id_cursoNuevo, String nombreNuevo, String modalidadNuevo , String fecha_finalizacionNuevo);

}
