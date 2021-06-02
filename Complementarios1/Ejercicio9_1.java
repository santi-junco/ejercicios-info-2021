import java.util.Scanner;

public class Ejercicio9_1 {
    public static void main(String[] args) {
        // no diferencia entre mayusculas y minusculas M != m
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = scan.nextLine();
        System.out.print("Ingrese una letra: ");
        String buscar = scan.next();
        char letra = buscar.charAt(0);
        scan.close();
        int contador = 0;
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)==letra){
                contador = contador + 1;
            }
        }
        System.out.println(letra+" se repite "+contador+" veces");
    }
}
