/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livrariashazam.models;

/**
 *
 * @author mvdo
 */
public class Cdbook extends Livros{

    private double duracao;
    private String preview;

    public Cdbook(String nome, String autor, String genero, double preco, int id) {
        super(nome, autor, genero, preco, id);
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
    
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }


}
