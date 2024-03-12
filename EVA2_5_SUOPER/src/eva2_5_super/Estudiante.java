
package eva2_5_super;
//           hija         de     Padre
//           subClase     de    SuperClase
public class Estudiante extends Persona {
    private String noControl;
    private String carrera;
    
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCALSE
        noControl = "-";
        carrera   = "-";
   
    }
        //REGLA DE HERENCIA: SIEMPRE HAY QUE LLAMAR AL CONSTRUCTOR DE LA SUPERCLASE
       //Y TIENE QUE SER LA PRIMERA INSTRUCCION DEL CONSTRUCTOR
    
    public Estudiante(String noControl, String carrera, String nombre, String apPaterno, String apMaterno, int edad, char genero) {
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = "-";
        this.carrera   = "-";
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    @Override
    public void imprime(){
    super.imprime();
        System.out.println("Numero de control: " + noControl);
        System.out.println("Carrera: " + carrera);
    
    }
    
}
