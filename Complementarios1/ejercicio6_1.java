import java.util.Scanner;

public class ejercicio6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int b = scan.nextInt();
        scan.close();
        int resultado = a;
        for (int i=1;i<b;i++){
            resultado = resultado * a;
        }
        System.out.println(a+" elevado a "+b+" = "+resultado);
    }
}
