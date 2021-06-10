import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scan.nextInt();
        scan.close();
        System.out.println("El factorial del numero es "+ factorial(numero));
    }

    public static int factorial(int valor){
        if (valor == 0){
            return 1;
        }else{
            return valor * factorial(valor - 1);
        }
    }
}
