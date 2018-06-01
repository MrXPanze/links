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
public class Cdbook extends Livros{


    private double duracao;

    public Cdbook(String nome, String autor, String genero, double preco, int id) {
        super(nome, autor, genero, preco, id);
    }


    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }


}
