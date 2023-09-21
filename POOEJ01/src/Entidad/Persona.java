/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author estar
 */
public class Persona {
    private String Nombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private int Edad ;
    private double peso ;
    
    //Constructor vacio
    public Persona () {
    
}
    //Constructor copia

    public Persona(String Nombre, String PrimerApellido, String SegundoApellido, int Edad, double peso) {
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.Edad = Edad;
        this.peso = peso;
    }
    //meetodos get y set

    public Persona(String jose) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
