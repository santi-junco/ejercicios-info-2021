package com.informatorio.ejermplo.repository;

import com.informatorio.ejermplo.entity.EmpleadoPlanta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpPlantaRepository extends CrudRepository<EmpleadoPlanta, Long> {
}
