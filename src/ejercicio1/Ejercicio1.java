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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1 , num2, resultado;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese dos numeros enteros para mostrar la suma de ambos");
        num1= leer.nextInt(); 
        num2= leer.nextInt();   
        resultado = num1+num2;
        System.out.println("la suma de los numeros es " + resultado );  

    }
    
}
