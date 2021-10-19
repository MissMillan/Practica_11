/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author milla
 */
public class Rectangulo extends FiguraGeometrica{
    
    //atributo
    
    
    //esto es el constructor
    public Rectangulo (String tipoFigura){
        super(tipoFigura);
    }
    
    //metodo que se llama dibujar
    @Override
    public void dibujar(){
        System.out.println("Se imprime un : "+ this.getClass().getSimpleName());
    }
    
}
