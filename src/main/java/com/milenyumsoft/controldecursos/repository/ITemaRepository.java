package com.milenyumsoft.controldecursos.repository;

import com.milenyumsoft.controldecursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
