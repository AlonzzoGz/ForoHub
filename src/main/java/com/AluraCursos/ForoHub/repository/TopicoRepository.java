package com.AluraCursos.ForoHub.repository;

import com.AluraCursos.ForoHub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Puedes agregar métodos personalizados de consulta si es necesario
}
