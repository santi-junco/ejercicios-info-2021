//package com.informatorio.ejermplo.controller;
//
//import com.informatorio.ejermplo.entity.Empleado;
//import com.informatorio.ejermplo.repository.EmpleadoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class EmpleadoController {
//    @Autowired
//    private EmpleadoRepository repository;
//    @GetMapping(value = "/empleados")
//    public @ResponseBody Iterable<Empleado> findEmpleados(){
//        return repository.findAll();
//    }
//}