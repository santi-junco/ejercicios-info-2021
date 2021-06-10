import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emple {
    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private double sueldo;

    // Seters 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFecha(String fecha){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fecha = LocalDate.parse(fecha,formato);
    }
    public void setSueldo(String sueldo){
        this.sueldo = Double.parseDouble(sueldo);
    }

    //Constructor
    public Emple (String nom, String ape, String fec, String suel){
        this.setNombre(nom);
        this.setApellido(ape);
        this.setFecha(fec);
        this.setSueldo(suel);
    }

    //Geters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(String fechaHoy){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate hoy = LocalDate.parse(fechaHoy,formato);
        int edad = hoy.getYear() - this.fecha.getYear();
        if (hoy.getMonthValue() == this.fecha.getMonthValue()){
            if (hoy.getDayOfMonth() < this.fecha.getDayOfMonth()){
                edad -= 1;
            }
        }else if (hoy.getMonthValue() < this.fecha.getMonthValue()){
            edad -= 1;
        }
        return edad;
    }
    public double getSueldo(){
        return sueldo;
    }

    @Override
    public String toString() {
        return nombre +" "+ apellido;
    }
}
