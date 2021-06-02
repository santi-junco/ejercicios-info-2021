import java.util.*;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        List <String> cartas = new ArrayList<>();
        cargarCartas(cartas);
        System.out.println("-----Cartas en orden-----");
        imprimirCartas(cartas);
        System.out.println("-----Cartas en orden inverso-----");
        Collections.reverse(cartas);
        imprimirCartas(cartas);
        System.out.println("-----Cartas mezcladas-----");
        Collections.shuffle(cartas);
        imprimirCartas(cartas);
    }

    public static void cargarCartas(List<String> array){
        array.add(0,"A");
        for (int i=2;i<11;i++){
            array.add(Integer.toString(i));
        }
        array.add(10,"J");
        array.add(11,"Q");
        array.add(12,"K");
    }

    public static void imprimirCartas(List<String> array){
        for (String carta:array){
            System.out.print(carta+" ");
        }
        System.out.println();
    }
}
