package com.informatorio.ejermplo.controller;

import com.informatorio.ejermplo.entity.EmpleadoContratado;
import com.informatorio.ejermplo.repository.EmpContratadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpContratadoController {
    @Autowired
    private EmpContratadoRepository repository;
    @GetMapping(value = "/empContratado")
    public @ResponseBody Iterable <EmpleadoContratado> findEmpleadoContratado(){
        return repository.findAll();
    }
}
