package org.example.Exercicio2;

import java.math.BigDecimal;

public class DolarCanadense implements Moeda{

    private final BigDecimal COTACAO_DOLAR_CANADENSE = new BigDecimal("4.15");

    @Override
    public BigDecimal obterCotacao() {
        return COTACAO_DOLAR_CANADENSE;
    }
}
