package com.livrariashazam.models;

/**
 *
 * @author mvdo
 */
public class Livros {

    private String nome;
    private String autor;
    private String genero;
    private double preco;
    private int id;

    public Livros(String nome, String autor, String genero, double preco, int id) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
      @Override
    public String toString(){
        return "ID "+this.id+"\nNome "+this.nome+"\nGenero"+this.genero+"\nAutor"+this.autor+
        "\nPreço"+this.preco;
        
    }

}
