/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercico12guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       multiplo( num1,  num2);
       
    }
    public static int multiplo(int  num1, int num2) {
        
        if(num1 % num2 ==0){
            System.out.println("El primer número es múltiplo del segundo");
        }else{
            System.out.println("no son multiplos");
        }
        return 0;
       
    }
    
    }
    
}
