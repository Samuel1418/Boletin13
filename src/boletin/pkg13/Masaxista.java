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
public class Masaxista extends Plantilla{
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {
        super(id,nome,apelido,edade);
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    public Masaxista(){}

    @Override
    public String toString() {
        return super.toString()+"\nMasaxista: " + "\ntitulacion=" + titulacion + "\nanosExperiencia=" + anosExperiencia;
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

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    

    
    public void concentrarse(){}
    
    public void viaxar(){
        JOptionPane.showMessageDialog(null,"Viaxan os masaxistas");
    }
    
    public void darMasaxes(){}
}
