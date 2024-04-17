
package eva2_14_vehiculos;

public abstract class Vehiculo {
    
    private int velocidad;

    public Vehiculo() {
        this.velocidad = 0;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void acelerar(int ajuste){
    
    velocidad += ajuste;
    
    }
    
    
    
    
    
}
