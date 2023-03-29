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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double temperatura;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese la Temperatura ");
      temperatura = leer.nextDouble();
      System.out.println("La Temperatura en Fahren " + ((9*temperatura/5)+32));
      
    }
    
}
