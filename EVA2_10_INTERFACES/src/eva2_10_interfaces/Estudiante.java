

package eva2_10_interfaces;

public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "----";
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    @Override
    public void imprimeDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellido());
        System.out.println("Edad: " + getEdad());    
        System.out.println("Año de nacimiento: " + calcularAnnioNacimiento());
    }

    @Override
    public String genNombreCompleto() {
    
        return getNombre() + " " + getApellido();
    }

    @Override
    public int calcularAnnioNacimiento() {

        return 2024 - getEdad();
    }
    
    
    
}
