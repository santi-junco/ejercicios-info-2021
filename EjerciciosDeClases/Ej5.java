import java.util.*;
import java.io.*;

public class Ej5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int op = 0;
        List <Emple> empleados = new ArrayList<Emple>();
        cargarEmpleados(empleados);
        while (opcion != 4){
            System.out.println("1. Listar empleados");
            System.out.println("2. Empleado mas joven y empleado mas viejo");
            System.out.println("3. Empleado que mas gana y empleado que menos gana");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    while(op < 1 || op > 2){
                        System.out.println("1. Listar empleados en orden alfabetico por apellido");
                        System.out.println("2. Listar empleados donde su apellido comienza por una letra");
                        System.out.print("Ingrese una opcion: ");
                        op = scan.nextInt();
                    }
                    if (op == 1){
                        listarAlfabeticamente(empleados);
                    }else{
                        System.out.print("Ingrese una letra: ");
                        char letra = scan.next().charAt(0);
                        listaEmpleados(letra, empleados);
                    }
                    op = 0;
                    break;
                case 2:
                    System.out.print("Ingrese la fecha actual (19-06-2021): ");
                    String fechaHoy = scan.next();
                    empleadoJyV(empleados, fechaHoy);
                    break;
                case 3:
                    empleadoRyP(empleados);
                    break;
                case 4:
                    break;
                default: 
                    System.out.println("Opcion incorrecta");
            }
            System.out.println();
        }
        scan.close();
    }    

    public static void cargarEmpleados(List<Emple> empleados){
        String archivo = "C:/Users/Santi/OneDrive/Escritorio/informatorio/Etapa 3/Java/EjerciciosDeClases/Empleados.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea = br.readLine();
            while (linea != null){
                instanciarEmpleado(linea, empleados);
                linea = br.readLine();
            }
        }catch(IOException ex){
            System.out.println(ex);
        }
    }

    public static void instanciarEmpleado(String linea, List<Emple> empleados){
        String [] informacion = linea.split(",");
        Emple emp = new Emple(informacion[0], informacion[1], informacion[2], informacion[3]);
        empleados.add(emp);
    }

    public static void listarAlfabeticamente(List<Emple> empleados){
        empleados.sort(Comparator.comparing(Emple::getApellido));
        for (Emple e : empleados){
            System.out.println(e.toString());
        }
    }

    public static void listaEmpleados(char letra, List<Emple> empleados){
        boolean esta = false;
        for (int i=0; i<empleados.size(); i++){
            char letraApellido = empleados.get(i).getApellido().charAt(0);
            if (Character.toUpperCase(letra) == letraApellido){
                System.out.println(empleados.get(i).toString());
                esta = true;
            }
        }
        if (!esta){
            System.out.println("No hay empleados cuyo apellido comienze con "+Character.toUpperCase(letra));
        }
    }

    public static void empleadoJyV(List <Emple> empleados, String fechaHoy){
        int inma = 0;
        int inme = 0;
        int menor = empleados.get(0).getEdad(fechaHoy);
        int mayor = empleados.get(0).getEdad(fechaHoy);
        for (int i=0; i<empleados.size(); i++){
            if (empleados.get(i).getEdad(fechaHoy) < menor){
                menor = empleados.get(i).getEdad(fechaHoy);
                inme = i;
            }
            if (empleados.get(i).getEdad(fechaHoy) > mayor){
                mayor = empleados.get(i).getEdad(fechaHoy);
                inma = i;
            }
        }
        System.out.println("El empleado mas joven es "+ empleados.get(inme)+ " tiene "+ menor+ " años");
        System.out.println("EL empleado mas viejo es "+ empleados.get(inma)+ " tiene "+ mayor+ " años");
    }

    public static void empleadoRyP(List <Emple> empleados){
        double mayor = 0;
        double menor = 0;
        int inma = 0;
        int inme = 0;
        for (int i=0; i<empleados.size(); i++){
            if (empleados.get(i).getSueldo() < menor){
                menor = empleados.get(i).getSueldo();
                inme = i;
            }
            if (empleados.get(i).getSueldo() > mayor){
                mayor = empleados.get(i).getSueldo();
                inma = i;
            }
        }
        System.out.println("El empleado que mas gana es "+ empleados.get(inma) +" $"+ empleados.get(inma).getSueldo());
        System.out.println("El empleado que menos gana es "+ empleados.get(inme) +" $"+ empleados.get(inme).getSueldo());
    }
}