import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = scan.nextInt();
        scan.close();
        int resultado = 0;
        for (int i=0;i<a;i++){
            resultado = resultado + b;
        }
        System.out.println(a+" * "+b+" = "+resultado);
    }
}
