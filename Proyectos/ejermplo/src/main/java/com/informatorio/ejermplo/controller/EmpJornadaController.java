package com.informatorio.ejermplo.controller;

import com.informatorio.ejermplo.entity.EmpleadoJornada;
import com.informatorio.ejermplo.repository.EmpJornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpJornadaController {
    @Autowired
    private EmpJornadaRepository repository;
    @GetMapping(value = "/empJornada")
    public @ResponseBody Iterable <EmpleadoJornada> findEmpleadoJornada(){
        return repository.findAll();
    }
}
