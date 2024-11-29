package com.milenyumsoft.controldecursos.repository;

import com.milenyumsoft.controldecursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
