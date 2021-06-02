import java.util.*;

public class Ejercicio7_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio=0,fin=0;
        while (inicio==fin || inicio>fin){
            System.out.print("Ingrese el valor del comienzo: ");
            inicio = scan.nextInt();
            System.out.print("Ingrese el numeo del fin: ");
            fin = scan.nextInt(); 
        }
        scan.close();
        fizzBuzz(inicio,fin);
    }

    public static void fizzBuzz(int ini, int fin){
        ArrayList <String> fb = new ArrayList<>();
        for (int i=ini;i<fin;i++){
            if(i%2==0 && i%3==0){
                fb.add("FizzBuzz");
            }else if(i%3==0){
                fb.add("Buzz");
            } else if(i%2==0){
                fb.add("Fizz");
            }else {
                fb.add(String.valueOf(i));
            }
        }
        for (String i : fb){
            System.out.print(i+" ");
        }
    }
}
