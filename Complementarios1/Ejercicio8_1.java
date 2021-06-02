import java.util.Scanner;

public class Ejercicio8_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomAp="";
        int edad=0;
        String ciudad ="";
        String direccion="";
        System.out.print("Ingrese su nombre y apellido: ");
        nomAp = scan.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();
        System.out.print("Ingrese su direccion: ");
        scan.nextLine();
        direccion = scan.nextLine();
        System.out.print("Ingrese su ciudad: ");
        ciudad = scan.nextLine();
        scan.close();
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nomAp);
    }
}
