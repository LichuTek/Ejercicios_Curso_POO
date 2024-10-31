/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstracta;

/**
 *
 * @author Lisandro
 */
public class Cuadrado extends Figura {
    
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    
    
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
