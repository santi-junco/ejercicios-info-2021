package com.informatorio.ejermplo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class EmpleadoContratado extends Empleado{

    private LocalDate fechaVencimiento;
    private String especialidad;
    private BigDecimal montoMensual;

    public void setFechaVencimiento(LocalDate fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setMontoMensual(BigDecimal montoMensual){
        this.montoMensual = montoMensual;
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
