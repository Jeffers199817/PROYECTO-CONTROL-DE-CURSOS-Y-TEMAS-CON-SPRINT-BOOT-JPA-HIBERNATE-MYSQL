package com.milenyumsoft.controldecursos.service;

import com.milenyumsoft.controldecursos.model.Tema;
import com.milenyumsoft.controldecursos.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository temaRepository;
    @Override
    public List<Tema> getTemas() {
        return temaRepository.findAll() ;
    }

    @Override
    public Tema getTema(Long id) {
        return temaRepository.findById(id).get();
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepository.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepository.deleteById(id);
    }

    @Override
    public Tema updateTema(Tema tema) {

            this.saveTema(tema);
            Tema tem = this.getTema(tema.getId_tema());


        return tem;
    }

    @Override
    public void updateTemas(Long idOriginal, Long idNuevo, String nombreNuevo, String descripcionNuevo) {

        Tema tema1 = this.getTema(idOriginal);

        tema1.setId_tema(idNuevo);
        tema1.setNombre(nombreNuevo);
        tema1.setDescripcion(descripcionNuevo);

        temaRepository.save(tema1);

    }
}
