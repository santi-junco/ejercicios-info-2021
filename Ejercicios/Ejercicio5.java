import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scan.nextInt();
        scan.close();
        for (int i=1;i<=10;i++){
            System.out.println(numero+" * "+i+" = "+numero*i);
        }
    }
}
