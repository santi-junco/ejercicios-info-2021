import java.io.*;
import java.util.*;
import Ejercicio_6.Empleado;

public class Ej4 {
    public static void main(String[] args){
        // Importo la clase empleado del Ejercicio 6 de los complementarios de nivel 2 y los instancio
        Empleado emp1 = new Empleado("Santiago Junco",1234,30,10000);
        Empleado emp2 = new Empleado("Camila Junco",2345,30,10000);
        Empleado emp3 = new Empleado("Aldana Junco",3456,30,10000);
        Empleado emp4 = new Empleado("Agustin Junco",4567,30,10000);
        Empleado emp5 = new Empleado("Jazmin Junco",5678,30,10000);
        Empleado emp6 = new Empleado("Lourdes Barrios",6789,30,10000);
        
        List <Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);
        empleados.add(emp6);
       
        String archivo = "C:/Users/Santi/OneDrive/Escritorio/informatorio/Etapa 3/Java/EjerciciosDeClases/Empleados.txt";
       
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))){
            bw.write("Nombre | DNI | Horas trabajadas | Valor por horas trabajadas \n");
            for(int i=0;i<empleados.size();i++){
                bw.write(empleados.get(i).toString()+"\n");
            }
            System.out.println("Archivo cargado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
