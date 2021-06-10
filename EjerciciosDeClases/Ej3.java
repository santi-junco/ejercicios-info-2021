import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        String archivo = "C:/Users/Santi/OneDrive/Escritorio/informatorio/Etapa 3/Java/EjerciciosDeClases/Alumnos.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
