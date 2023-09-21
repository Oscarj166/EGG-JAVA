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
public class EjemploYouToBe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado = suma(12, 12);
        System.out.println(resultado);
        
        saludoPersonal("Juan");
        
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        saludoPersonal(nombre);
        
        saludoPersonal(scanner.next());
        
        
    }
    public static int suma(int a, int b) {
        
        int res = a + b;
        
        return res;
    }
    
    public static void saludoPersonal(String nombre) {
        System.out.println("Hola " + nombre + " como estas");
    }
    
}

