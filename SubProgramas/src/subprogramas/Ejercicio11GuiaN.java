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
public class Ejercicio11GuiaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String nombre = scanner.nextLine();
        frases( nombre);
        frases( scanner.nextLine());
       
        
    }
    public static String frases(String nombre) {
     
        nombre = nombre.replace("a","@");
        nombre = nombre.replace("e","#");
        nombre = nombre.replace("i","$");
        nombre = nombre.replace("o","%");
        nombre = nombre.replace("u","*");
        
         System.out.println(nombre);
         
        return nombre ;
        
    }
    
}
