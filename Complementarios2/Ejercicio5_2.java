import java.util.*;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        List <Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6,7,8,4,5));
        List <Integer> valorPorHoras = new ArrayList<>(Arrays.asList(350,345,550,600,320));
        List <Integer> totales = new ArrayList<>();
        caluclarSueldo(horasTrabajadas,valorPorHoras,totales);
        int totFinal = 0;
        System.out.println(totales);
        System.out.println("Total a pagar $"+totalFinal(totales,totFinal));
    }    

    public static void caluclarSueldo(List<Integer> horas, List<Integer> valor, List<Integer> total){
        for (int i=0;i<horas.size();i++){
            total.add(horas.get(i)*valor.get(i));
        }
    }

    public static int totalFinal(List<Integer> array, int sumador){
        for (Integer valor:array){
            sumador += valor;
        }
        return sumador;
    }
}
