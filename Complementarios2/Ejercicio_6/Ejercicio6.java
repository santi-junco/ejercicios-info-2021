package Ejercicio_6;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Santiago Junco", 12345, 5, 1500);
        Empleado emp2 = new Empleado("santiago", 23456, 6, 1500);
        Empleado emp3 = new Empleado("santiago", 34567, 9, 1500);
        Empleado emp4 = new Empleado("santiago", 45678, 10, 1500);
        Empleado emp5 = new Empleado("santiago", 56789, 8, 1500);

        Set <Empleado> empleados = new HashSet<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);
        
        Map <Integer,Float> aPagar = new HashMap<>();

        for (Empleado e : empleados){
            aPagar.put(e.getDni(), e.calcularSueldo());
        }
        
        System.out.println("DNI : Pago");
        for (Map.Entry<Integer,Float> pago : aPagar.entrySet()){
            System.out.println(pago.getKey()+" : $"+pago.getValue());
        }
    }
}
