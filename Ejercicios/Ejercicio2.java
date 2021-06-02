import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        int b = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        int c = scan.nextInt();
        System.out.println("El primer numero es: "+a);
        System.out.println("El segundo numero es: "+b);
        System.out.println("El tercer numero es: "+c);
        scan.close();
    }
}
