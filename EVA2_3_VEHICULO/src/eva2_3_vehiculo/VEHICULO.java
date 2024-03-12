
package eva2_3_vehiculo;


public class VEHICULO {
private String marca;
private String modelo;
private int anio;
private String color;
    public VEHICULO() {
        
        this.marca = "SIN MARCA";
        this.modelo = "SIN MODELO";
        this.anio = 0;
        this.color = "SIN COLOR";
        
    }

    public VEHICULO(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imprime(){
    
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
    
    
    }    
    
    
    
    
    
    
}
