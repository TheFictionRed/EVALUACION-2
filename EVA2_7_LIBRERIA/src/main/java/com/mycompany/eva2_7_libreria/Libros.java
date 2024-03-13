/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_libreria;

/**
 *
 * @author FERNANDO
 */
public class Libros extends Publicaciones{
    private String autor;

    public Libros(){
        //REGLA: SIEMPRE SE LLAMA AL CONSTRUCTOR DE LA SUPERCLASE        
        super();
         this.autor = "----";
    }
    public Libros(String autor) {
        this.autor = autor;
    }
    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }
    
    @Override
      
    public void imprimie(){
    
      super.imprimie();
      System.out.println("Autor: " + autor);
        
    
    }

   

    

    
    
    
    public void ordenarCopias(int cant){
        int existencias = getCopias();
        setCopias(existencias + cant);
    }
    
    
}
