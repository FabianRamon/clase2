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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero entero porfavor");
        numero= leer.nextInt();
        System.out.println("el doble es "+(numero*2)+" el triple es "+(numero*3)+" y la raiz cuadarada es "+Math.sqrt(numero));
    }
    
}
