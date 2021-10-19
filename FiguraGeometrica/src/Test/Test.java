/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Dominio.*;

/**
 *
 * @author milla
 */
public class Test {
    
      public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();//de la clase que tiene ese metodo
        
       FiguraGeometrica circulo = new Circulo("Circulo");
        circulo.dibujar();
    }
}
