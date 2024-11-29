package com.milenyumsoft.controldecursos.service;

import com.milenyumsoft.controldecursos.model.Tema;

import java.util.List;

public interface ITemaService {


    public List<Tema> getTemas();

    public Tema getTema(Long id);

    public void saveTema(Tema tema);

    public void deleteTema(Long id);

    public Tema updateTema(Tema tema);

    public void updateTemas(Long idOriginal, Long idNuevo, String nombreNuevo, String descripcionNuevo);
}
