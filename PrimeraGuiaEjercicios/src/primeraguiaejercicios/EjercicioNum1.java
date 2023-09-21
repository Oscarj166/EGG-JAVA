/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraguiaejercicios;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class EjercicioNum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();
        if(num % 2 ==0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
    
}
