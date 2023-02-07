/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadvocales;

import javax.swing.JOptionPane;
import static recursividadvocales.Vocales.eliminarVocales;

/**
 *
 * @author tdani
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Frase = JOptionPane.showInputDialog(null, "Por favor, escriba una frase");
        String resultado = eliminarVocales(Frase);
        JOptionPane.showConfirmDialog(null, resultado);

    }

}
