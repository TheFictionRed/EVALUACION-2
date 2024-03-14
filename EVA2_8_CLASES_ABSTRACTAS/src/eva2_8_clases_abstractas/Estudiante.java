
package eva2_8_clases_abstractas;

import prueba.Persona;


public class Estudiante extends Persona {
    
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = noControl;
    }
    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    // AL SER PROTECTED, PODEMOS VER LOS ATRUBUTOS DE PERSONA POR ESTRA VINCULADOS POR HERENCIA 
    // TAMBIEN HAY VISIBILIDAD DE PAQUETES ----> CLASES EN EL MISMO PAQUETE PUDEN VER ATRIBUTOS 
    // Y MÉTODOS PROTEGIDOS 
    
    public void imprime(){
    
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de control: " + noControl);
        
    }

    
    
}
