/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesifelse;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio6Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hacer una variable scanner
        Scanner enteros = new Scanner(System.in);
        int num1, num2;
        //Solicite por pantalla 2 nummeros enteros
        System.out.println("Ingrese dos numeros enteros");
        num1= enteros.nextInt();
        num2= enteros.nextInt();
        
        //se hace un condicional para determinar si alguno de los numeros ingresados es mayor a 25
        
        if ( num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayos a 25");
        } else if (num1 > 25 || num2 > 25 ) {
            System.out.println("Uno de elllos es mayor");
        } else {
            System.out.println("Ninguno es mayor");
        }
        
        
       
    }
    
}
