/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg13;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plantilla obxPlantilla = new Plantilla(123,"Pepa","Rodriguez",27);
        Xogador obxXogador = new Xogador(14,"Samuel","Gomez",21,14,"pivot");
        Masaxista obxMasaxista = new Masaxista(45,"Manuel","Jimenez",34,"Fisioterapeuta",6);
        Adestrador obxAdestrador = new Adestrador(985,"Oscar","Estevez",39,"Galega");
      
        
        obxXogador.viaxar();
        JOptionPane.showMessageDialog(null,obxXogador.toString());
        
       obxMasaxista.viaxar();
        JOptionPane.showMessageDialog(null,obxMasaxista.toString());
        
       obxAdestrador.viaxar();
        JOptionPane.showMessageDialog(null,obxAdestrador.toString());
        
        obxPlantilla.viaxar();
        JOptionPane.showMessageDialog(null,obxPlantilla.toString());
    }
    
}