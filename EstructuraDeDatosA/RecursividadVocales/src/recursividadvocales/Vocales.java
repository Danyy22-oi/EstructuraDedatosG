/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividadvocales;

import javax.swing.JOptionPane;

/**
 *
 * @author tdani
 */
public class Vocales {

    public static void main(String[] args) {

        String Frase = JOptionPane.showInputDialog(null, "Por favor, escriba una frase");
        String resultado = eliminarVocales(Frase);
        JOptionPane.showConfirmDialog(null, resultado);
    }

    public static String eliminarVocales(String Frase) {
        String Vocales = "aeiouAEIOU";
        if (Frase.length() == 0) {
            return Frase;
        } else {
            char firstLetter = Frase.charAt(0);
            if (Vocales.indexOf(firstLetter) != -1) {
                return eliminarVocales(Frase.substring(1));
            } else {
                return firstLetter + eliminarVocales(Frase.substring(1));
            }
        }
    }

}
