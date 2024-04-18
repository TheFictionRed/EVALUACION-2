
package eva2_15_clases_anonimas;

/**
 *
 * @author FERNANDO
 */
public class EVA2_15_CLASES_ANONIMAS {

  
    public static void main(String[] args) {
      //NO SE PUEDEN CREAR OBJETOS DE INTERFACES
      //USAMOS POLIMORFISMO
      //ESTAMOS CREADNO UNA CLASE (SIN NOMBRE) QUE IMPLEMENTA
      //LOS METODOS DE INTERFACES 
     
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
               
                System.out.println("Hola mundo!!");
                
            }
        };
        prueba.mostrarMensaje();
       
     
        claseAbstracta prueba2 = new claseAbstracta() {
            @Override
            public void otroMensaje() {
                System.out.println("Ahora con clase abstracta");
            }
        };
        
        prueba2.mensaje();
        prueba2.otroMensaje();
        
    }
    
}


interface Prueba{
 public void mostrarMensaje();

}
abstract class claseAbstracta{

public void mensaje(){

    System.out.println("Hola mundo!!");

}
public abstract void otroMensaje();




}


