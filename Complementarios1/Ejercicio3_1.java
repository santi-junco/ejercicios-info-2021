import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int x = scan.nextInt();
        scan.close();
        for (int i=1;i<=x;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
