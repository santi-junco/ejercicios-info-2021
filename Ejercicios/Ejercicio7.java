public class Ejercicio7 {
    private static String bienvenida = "Bienvenida";
    public static void main(String[] args) {
        System.out.println(bienvenida);
        String hola = "hola";
        imprimirTexto(hola,3);
    }
    public static void imprimirTexto(String texto, int contador){
        for (int i=0;i<contador;i++){
            System.out.println(texto);
        }
    }
    }
