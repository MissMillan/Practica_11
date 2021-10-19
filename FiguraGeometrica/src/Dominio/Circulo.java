/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author milla
 */
public class Circulo extends FiguraGeometrica{

    
    //esto es el constructor
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

     //esto es un metodo
    @Override
     public void dibujar(){
        System.out.println("Se imprime un : "+ this.getClass().getSimpleName());
    }
    
    
    
}
