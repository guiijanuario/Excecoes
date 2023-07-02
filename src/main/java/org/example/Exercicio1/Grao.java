package org.example.Exercicio1;

public class Grao implements Alimento{

    private String nome;
    private double quantidade;

    public Grao(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getQuantidade() {
        return quantidade + "g";
    }
}
