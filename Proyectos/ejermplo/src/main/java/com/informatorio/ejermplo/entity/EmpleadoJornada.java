package com.informatorio.ejermplo.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class EmpleadoJornada extends Empleado{

    private BigDecimal montoPorHora;

    public void setMontoPorHora(BigDecimal montoPorHora){
        this.montoPorHora = montoPorHora;
    }

    public BigDecimal getMontoPorHora(){
        return montoPorHora;
    }
}
