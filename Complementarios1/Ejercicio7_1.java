
import java.util.*;

public class Ejercicio7_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rta = "";
        char a;
        System.out.print("Ingrese una palabra: ");
        String palabra = scan.next();
        scan.close();
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)>='a' && palabra.charAt(i)<='z'){
                a = (char)(palabra.charAt(i)-32);
            }else{
                a = (char)(palabra.charAt(i));
            }
            rta += a;
        }
        System.out.println(rta);
    }
}
