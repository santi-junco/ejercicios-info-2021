package com.informatorio.ejermplo.entity;

import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EmpleadoPlanta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private LocalDate fechaInicio;
    private String puesto;
    private BigDecimal sueldo;

    public void setId(Long id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setMonto(BigDecimal sueldo){
        this.sueldo = sueldo;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public LocalDate getFechaInicio(){
        return fechaInicio;
    }
    public String getPuesto(){
        return puesto;
    }
    public BigDecimal getSueldo(){
        return sueldo;
    }
}
