package org.example.Exercicio1;

public class Legume implements Alimento{

    private String nome;
    private int quantidade;

    public Legume(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getQuantidade() {
        if (quantidade == 1) {
            return quantidade + " unidade";
        }

        return quantidade + " unidades";
    }
}
