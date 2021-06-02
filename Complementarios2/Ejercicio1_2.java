import java.util.*;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        List <String> ciudades = new ArrayList<>();
        cargarString(ciudades);
        imprimirRanking(ciudades);
    }   

    public static void cargarString(List<String> array){
        array.add("Ciudad 1");
        array.add("Ciudad 2");
        array.add("Ciudad 3");
        array.add("Ciudad 4");
        array.add("Ciudad 5");
    }
    
    public static void imprimirRanking(List <String> array){
        for (int i=0;i<array.size();i++){
            System.out.println("#"+(i+1)+"-"+array.get(i));
        }
    }
}