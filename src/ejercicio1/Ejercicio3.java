/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author wolve
 */
public class Ejercicio3 {
//scribir un programa que pida una frase 
    //y la muestre toda en mayúsculas 
    //y después toda en minúsculas. 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("Minuscula "+ frase.toLowerCase());
        System.out.println("Mayuscula "+ frase.toUpperCase());
        
    }
    
}
