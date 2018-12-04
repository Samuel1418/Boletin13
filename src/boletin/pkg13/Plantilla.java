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
public class Plantilla {
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    
    public Plantilla(){}
     public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxa a selección");
    }

    public Plantilla(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
     

    @Override
    public String toString() {
        return "Plantilla:"+"\nid=" + id + "\nnome=" + nome + "\napelido=" + apelido + "\nedade=" + edade;
    }
     
     
}
