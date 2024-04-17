
package eva2_14_vehiculos;

/**
 *
 * @author FERNANDO
 */
public class Motocicleta extends Vehiculo{
    private int capacidad;

    public Motocicleta() {
        super();
    }

    public Motocicleta(int capacidad, int velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
}
