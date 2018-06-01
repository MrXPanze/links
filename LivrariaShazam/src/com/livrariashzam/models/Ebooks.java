/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livrariashzam.models;

/**
 *
 * @author mvdo
 */
public class Ebooks extends Livros {


    private boolean preview;
  

    public Ebooks(String nome, String autor, String genero, double preco, int id) {
        super(nome, autor, genero, preco, id);
    }


    public boolean isPreview() {
        return preview;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

   

}
