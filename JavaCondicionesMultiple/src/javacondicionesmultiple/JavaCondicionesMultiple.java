/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacondicionesmultiple;

import java.util.Scanner;

/**
 *
 * @author Alriosa
 */
public class JavaCondicionesMultiple {


    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner in = new Scanner(System.in);
       
            int variable;
        
       
            System.out.println("Ingrese un valor");
        
       
            variable = in.nextInt();
         
            if(variable==1){
               System.out.println("El numero fue 1"); 
            }
            if(variable==2){
               System.out.println("El numero fue 2"); 
            }
            if(variable==3){
               System.out.println("El numero fue 3"); 
            }
            if(variable>=4){
               System.out.println("El numero es mayor a 3"); 
               System.out.println("El numero fue "+ variable);
            }
       
        
    }
    
}
