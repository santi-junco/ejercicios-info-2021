package com.informatorio.ejermplo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EmpleadoContratado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private LocalDate fechaVencimiento;
    private String especialidad;
    private BigDecimal montoMensual;

    public void setId(Long id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this .apellido = apellido;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setMontoMensual(BigDecimal montoMensual){
        this.montoMensual = montoMensual;
    }

    public Long getId(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public LocalDate getFechaVencimiento(){
        return fechaVencimiento;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public BigDecimal getMontoMensual(){
        return montoMensual;
    }
}
