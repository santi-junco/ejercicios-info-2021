package com.informatorio.ejermplo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EmpleadoJornada extends Empleado{
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
     */
    private BigDecimal montoPorHora;

    /*
    public void setId(Long id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimientio(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
     */
    public void setMontoPorHora(BigDecimal montoPorHora){
        this.montoPorHora = montoPorHora;
    }

    /*
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
     */
    public BigDecimal getMontoPorHora(){
        return montoPorHora;
    }
}
