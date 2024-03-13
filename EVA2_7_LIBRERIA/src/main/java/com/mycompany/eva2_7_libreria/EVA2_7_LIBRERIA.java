

package com.mycompany.eva2_7_libreria;


public class EVA2_7_LIBRERIA {

    public static void main(String[] args) {
       Libros libro = new Libros("Juan Rulfo", "El llano en llamsa", 500.00, 10);
       
       libro.imprimie();
       libro.venderCopias(5);
       libro.imprimie();
       libro.ordenarCopias(100);
       libro.imprimie();
       libro.venderCopias(200);
       libro.imprimie();
       
    }
}


