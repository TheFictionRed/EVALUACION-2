
package eva2_1_sobrecarga_metodos;

public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("La suma de 5 + 4 =" + sumar(5, 4));
        System.out.println("La suma de 3.1 + 2.1 =" + sumar(3.1,2.5));
        System.out.println("La suma de hola + mundo es " + sumar("hola ","mundo"));
        sumar();
        
        
        
        
        
        
        
        
        
    }
            //SOBRECARGA DE METODOS; MISMO NOMBRE PARA 
            //3 DIFERENTES METODOS
        public static int sumar(int num1, int num2){

        return num1+num2;
  
        }
        
        public static double sumar(double num1, double num2){
  
        return num1+num2;
        
        }
        public static String sumar(String num1, String num2){
  
        return num1+num2;
        
        }
        public static void sumar(){
  
            System.out.println("Método que no hace nada");
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

