package com.milenyumsoft.controldecursos.service;

import com.milenyumsoft.controldecursos.model.Curso;
import com.milenyumsoft.controldecursos.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoService implements ICursoService {

    @Autowired
    private ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso getCurso(Long id) {
        return cursoRepository.findById(id).get();
    }

    @Override
    public void createCurso(Curso curso) {

        cursoRepository.save(curso);

    }

    @Override
    public void deleteCurso(Long id) {
    cursoRepository.deleteById(id);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        this.createCurso(curso);
        Curso cur = this.getCurso(curso.getId_curso());
        return  cur;
    }

    @Override
    public Curso updateCurso(Long idOriginal, Long id_cursoNuevo, String nombreNuevo, String modalidadNuevo , String fecha_finalizacionNuevc) {

        Curso cur = this.getCurso(idOriginal);
        cur.setId_curso(id_cursoNuevo);
        cur.setNombre(nombreNuevo);
        cur.setModalidad(modalidadNuevo);
        cur.setFecha_finalizacion(fecha_finalizacionNuevc);

        this.createCurso(cur);

        return cur;
    }
}
