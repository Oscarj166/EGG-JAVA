
import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author altam
 */
public class Main {
    public static void main(String[] args) {
        CuentaBancariaServicio sv = new CuentaBancariaServicio();
         CuentaBancaria ob1 = sv.crearCuenta();
         sv.ingresar(ob1);
         sv.retirar(ob1);
         sv.extraccionRapida(ob1);
         System.out.println(ob1.toString());
        
        
    }
}
