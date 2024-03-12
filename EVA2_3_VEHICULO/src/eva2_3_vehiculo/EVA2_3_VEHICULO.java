
package eva2_3_vehiculo;


public class EVA2_3_VEHICULO {

    public static void main(String[] args) {
        VEHICULO car1 = new VEHICULO();
        
        car1.imprime();
        
        VEHICULO car2 = new VEHICULO("Ford", "F-150", 2010, "Rojo");
        car2.imprime();
        car2.setMarca("CHINA");
        car2.setModelo("Japónes");
        car2.setAnio(2100);
        car2.setColor("ROSA");
        car2.imprime();
        
        
        
    }
    
}
