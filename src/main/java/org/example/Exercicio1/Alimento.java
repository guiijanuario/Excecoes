package org.example.Exercicio1;

public interface Alimento {

    //Sempre que criar um "Produto novo" o retorno do getQuantidade sempre vai ser a...
    // quantidade do produto + o tipo de medição se é gramas, kilos, litros e etc
    String getQuantidade();

    String getNome();

}
