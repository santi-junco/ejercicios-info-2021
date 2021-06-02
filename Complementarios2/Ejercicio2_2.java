import java.util.*;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        cargarNumeros(numeros);
        System.out.println("-----Lista orignal----");
        imprimirLista(numeros);
        System.out.println("Tamaño de la lista: "+numeros.size());
        agregarElementos(numeros);
        System.out.println("-----Lista modificada----");
        imprimirLista(numeros);
        System.out.println("Tamaño de la lista: "+numeros.size());
    }

    public static void cargarNumeros(List<Integer> array){
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
    }

    public static void imprimirLista(List<Integer> array){
        System.out.println("Elementos: ");
        for (int i=0;i<array.size();i++){
            System.out.print(array.get(i)+" ");
        }
        System.out.println();
    }

    public static void agregarElementos(List<Integer> array){
        array.add(0,0);
        array.add(6,6);
    }
}
