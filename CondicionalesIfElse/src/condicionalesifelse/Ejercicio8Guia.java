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
public class Ejercicio8Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
  	 
   	int suma, num, i;
  	 
   	suma = 0;
        i=0;
        
        do{            
            System.out.println("Ingrese un numero");
            num = nota.nextInt();
            if (num==0) {
                System.out.println("Se capturo el numero 0");
                break;   
            }else if (num>0) {
                suma+=num;
            }
            i++;
        }while (i<20);
      	 
    	System.out.println("La suma es: " + suma);
    	
    
        }
    }
  

