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
public class Ebooks extends Livros {

    private String responsividade;
    private String preview;

    public Ebooks(String nome, String autor, String genero, double preco, int id) {
        super(nome, autor, genero, preco, id);
    }
    
    public String getResponsividade() {
        return responsividade;
    }

    public void setResponsividade(String responsividade) {
        this.responsividade = responsividade;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }


   

}
