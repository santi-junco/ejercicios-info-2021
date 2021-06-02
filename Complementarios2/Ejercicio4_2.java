import java.util.*;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        List <String> nombres= new ArrayList<>();
        List <String> curso1 = new ArrayList<>();
        List <String> curso2 = new ArrayList<>();
        List <String> curso3 = new ArrayList<>();
        cargarNombres(nombres);
        System.out.println("----Lista original----");
        imprimirLista(nombres);
        System.out.println("--Curso 1--");
        separarEnCursos(nombres, curso1, 0, 4);
        imprimirLista(curso1);
        System.out.println("--Curso 2--");
        separarEnCursos(nombres, curso2, 4, 8);
        imprimirLista(curso2);
        System.out.println("--Curso 3--");
        separarEnCursos(nombres, curso3, 8, 12);
        imprimirLista(curso3);
    }

    public static void cargarNombres(List<String> array){
        array.add("Santiago Junco");
        array.add("Lourdes Barrios");
        array.add("Jazmin Junco");
        array.add("Belen Barrios");
        array.add("Santiago Junco");
        array.add("Lourdes Barrios");
        array.add("Jazmin Junco");
        array.add("Belen Barrios");
        array.add("Santiago Junco");
        array.add("Lourdes Barrios");
        array.add("Jazmin Junco");
        array.add("Belen Barrios");
    }

    public static void imprimirLista(List<String> array){
        for (String nombre:array){
            System.out.println(nombre);
        }
    }

    public static void separarEnCursos(List<String> original, List<String> curso, int inicio, int fin){
        curso.addAll(original.subList(inicio,fin));
    }
}
