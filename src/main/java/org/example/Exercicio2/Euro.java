package org.example.Exercicio2;

import java.math.BigDecimal;

public class Euro implements Moeda{

    private final BigDecimal COTACAO_EURO = new BigDecimal("6.15");

    @Override
    public BigDecimal obterCotacao() {
        return COTACAO_EURO;
    }
}
