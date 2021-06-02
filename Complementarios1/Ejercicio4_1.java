
import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int x = scan.nextInt();
        int resultado = 1;
        scan.close();
        for (int i=1;i<=x;i++){
            resultado = resultado * i;
        }
        System.out.println("El factorial de "+x+" es: "+resultado);
    }
}
