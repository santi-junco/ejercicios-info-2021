package com.informatorio.ejermplo.controller;

import com.informatorio.ejermplo.entity.EmpleadoPlanta;
import com.informatorio.ejermplo.repository.EmpPlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpPlantaController {
    @Autowired
    private EmpPlantaRepository repository;
    @GetMapping(value = "/empPlanta")
    public @ResponseBody Iterable<EmpleadoPlanta> findEmpleadoPlanta(){
        return repository.findAll();
    }
}
