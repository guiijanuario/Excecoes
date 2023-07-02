package org.example.Exercicio1;

public class Outros implements Alimento{

    private String nome;
    private int quantidade;

    public Outros(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getQuantidade() {
        if(quantidade == 1) return quantidade + "unidade";
        return quantidade + "unidades";
    }

    @Override
    public String getNome() {
        return nome;
    }
}
