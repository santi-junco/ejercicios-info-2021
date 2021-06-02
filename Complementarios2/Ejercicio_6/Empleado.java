package Ejercicio_6;


public class Empleado {
    private String nYa;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHoras;

    public Empleado(String nom, int dni, int hT, int vH){
        this.nYa = nom;
        this.dni = dni;
        this.horasTrabajadas = hT;
        this.valorPorHoras = vH;
    }

    public int getDni() {
        return dni;
    }

    public float calcularSueldo(){
        return this.horasTrabajadas * this.valorPorHoras;
    }
}
