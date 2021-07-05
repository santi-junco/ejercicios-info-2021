package com.informatorio.ejermplo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EmpleadoPlanta extends Empleado{

    private LocalDate fechaInicio;
    private String puesto;
    private BigDecimal sueldo;

    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setMonto(BigDecimal sueldo){
        this.sueldo = sueldo;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
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
