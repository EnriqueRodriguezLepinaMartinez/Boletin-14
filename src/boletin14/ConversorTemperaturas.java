/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class ConversorTemperaturas {
    private final int tminima = 80;
    
    /**
     * 
     * @param centigrados
     * @return 
     */
public double centigradosAFharenheit(float centigrados){
    
    double fharenheit = 9.0 / 5.0 * centigrados + 32.4;
    
    return fharenheit;
}
    /**
     * 
     * @param centigrados 
     */
public void centígradosAReamur(float centigrados){
    
    double reamur = 4.0 / 5.0 * centigrados;
    
}
    
}
