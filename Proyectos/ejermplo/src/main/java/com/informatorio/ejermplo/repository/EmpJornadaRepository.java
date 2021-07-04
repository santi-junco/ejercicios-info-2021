package com.informatorio.ejermplo.repository;

import com.informatorio.ejermplo.entity.EmpleadoJornada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpJornadaRepository extends CrudRepository <EmpleadoJornada, Long> {
}
