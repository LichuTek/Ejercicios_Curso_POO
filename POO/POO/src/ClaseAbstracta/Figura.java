/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstracta;

/**
 *
 * @author Lisandro
 */
public abstract class Figura {
    protected double x; // Declaro la ubicacion de la figura esto va a ser independiente de que figura este
    protected double y; // 
    
    protected Figura(){}
    
    protected Figura (double x, double y){
        this.x = x;
        this.y = y;
    }
    
    
    
    public abstract double calcularArea(); // Las distintas figuras van a calcular de manera 
}
