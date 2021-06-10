import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println("La suma de los numeros es "+ calcularSuma(num1, num2));
    }

    public static int calcularSuma(int x, int y){
        return x + y;
    }
}
