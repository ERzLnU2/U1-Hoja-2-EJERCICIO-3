/**
 * @author DAW120
   📌 EJERCICIO 3, Hoja 2.   
 
   🔴 Programa que declara una variable que almacenará el precio de una vivienda que
     se pide por teclado su valor, por ejemplo 224000.70 euros, después nos visualiza
     dicho precio en euros y en pesetas.
     
     * El precio de la vivienda en euros es: 224.000,70
     * El precio de la vivienda en pesetas es: 37.270.580
      
       🏴‍ (1 euro = 166,386 pesetas)
 */
package com.solomongo.ejercicio3_hoja2;
import javax.swing.JOptionPane;
public class Ejercicio3_Hoja2 {

    public static void main(String[] args) {
        
        String texto;  // el string ya sabes que es lo que escribirá un@ user
        double valor;  // si el valor pinta decimal se pone este tipo double..
        
        texto=JOptionPane.showInputDialog("🚀 Meter el precio de la vivienda: \n€");
        valor=Double.parseDouble(texto); // aqui es donde se aplica el metodo, en el caso Double..
        
        System.out.printf("\n\tEl precio de la vivienda en euros es: %,.2f", valor); // se aplican MASCARAS
        System.out.printf("\n\tEl precio de la vivienda en pesetas es: %,.2f", valor*166,386);
        System.out.println("\n\n");
    }
}
