
package eva2_10_interfaces;

public class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this.nombre = "------";
        this.apellido = "------";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
/*
    @Override
    public void imprimeDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String genNombreCompleto() {
        return nombre + " " + apellido;
    }
   */
}
