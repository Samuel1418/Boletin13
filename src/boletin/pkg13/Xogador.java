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
public class Xogador extends Plantilla{
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    private int dorsal;
    private String demarcacion;

    public Xogador (){}
    
    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id,nome,apelido,edade); //para que la clase padre coja todos los parametros bien
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
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

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\nXogador: " + "\ndorsal=" + dorsal + "\ndemarcacion=" + demarcacion ; //al retornar el super de la clase mayor, ya llamamos a los parametros que hay en todos
    }
    
    
    
    
private void concentrarse(){}

    @Override
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores");
    }

public void xogarPartido(){}

public void entrenar(){}


}

