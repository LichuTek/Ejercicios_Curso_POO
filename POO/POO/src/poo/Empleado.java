/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Lisandro
 */
public class Empleado extends Persona {
    int num_legajo;
    
    public Empleado(){}
    
    public Empleado(int legajo, String nombre, String apellido, int dni){
        super(nombre,apellido,dni);
        this.num_legajo = legajo;
    }
    
    
    public void setLegajo (int legajo) {
        this.num_legajo = legajo;
    }
   
    
}
