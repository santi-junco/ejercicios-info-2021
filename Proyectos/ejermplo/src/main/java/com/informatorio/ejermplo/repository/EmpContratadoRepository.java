package com.informatorio.ejermplo.repository;

import com.informatorio.ejermplo.entity.EmpleadoContratado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpContratadoRepository extends CrudRepository <EmpleadoContratado, Long> {
}
