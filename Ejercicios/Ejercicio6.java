import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero=1;
        while (numero==1){
            System.out.print("Ingrese un numero: ");
            numero = scan.nextInt();
            System.out.println("El numero ingresado es: "+numero);
            System.out.print("Ingrese 1 para continuar o cualquier otro numero para salir: ");
            numero = scan.nextInt();
        }
        scan.close();
    }
}
