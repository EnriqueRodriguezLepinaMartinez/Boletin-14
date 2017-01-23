/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;


/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        // TODO code application logic here
        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Centigrados"));        
        ConversorTemperaturas conversion = new ConversorTemperaturas();
        double grao = conversion.centigradosAFharenheit(centigrados);
        System.out.println(grao);
        limite(grao);
    }
    
     static void limite(double grado)throws TemperaturaErradaExcepcion{
        if(grado < 80){
            throw new TemperaturaErradaExcepcion("Grados por debajo del limite");
        }
}
}