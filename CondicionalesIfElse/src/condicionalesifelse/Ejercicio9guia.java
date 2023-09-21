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
public class Ejercicio9guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num,suma=0, i = 0;
     
        
       do{
            System.out.println("Ingrese un numero");
    	   num = scanner.nextInt();
          
          
            if(num==0) {
               System.out.println("Se capturó el numero cero"); 
           break;
            }
           
            else {
                  suma +=num; 
                   }
         i++;
    	}while(i <20);
       
        System.out.println("La suma es:" + suma);
 

    }
    
}
