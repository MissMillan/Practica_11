/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

/**
 *
 * @author milla
 */
public class ManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int res = 0;
        
      //por que no se puede dividir un numero entre 0
    
     try   {
           res = 10/10;
     }catch(Exception e){//estoy manejando la exception , en caso de que me de el errro
         e.printStackTrace(System.out);
         
     }
    
    }
    
    
    
    
    
}

