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
public class Ejercicio7guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hacer una variable Scanner
        Scanner fluidos = new Scanner(System.in);

    	int motor;

    	System.out.println("Ingrese una opción entre 1 y 4");

    	motor = fluidos.nextInt();

    	switch (motor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;
            
                case 3:
           System.out.println("La bomba es una bomba de hormigón");
            break;

            
                case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
            break; 
            
            
        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
    	}
}

    }
    
}
