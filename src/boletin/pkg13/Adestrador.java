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
public class Adestrador extends Plantilla {
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    private String idFederacion;

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id,nome,apelido,edade);
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAdestrador: " + edade + "\nidFederacion=" + idFederacion;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getEdade() {
        return edade;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    
public Adestrador(){}
    
    public void concentrarsse(){}
    
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan adestradores");
    }
    
    public void dirixirPartido(){}
    
    public void dirixirAdestramento(){}
}
