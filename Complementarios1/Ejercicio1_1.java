import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scan.next();
        scan.close();
        System.out.println("HOLA " + nombre);
    }
}
