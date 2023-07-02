package org.example.Exercicio2;

import java.math.BigDecimal;

public class DolarAmericano implements Moeda{

    private final BigDecimal COTACAO_DOLAR_AMERICANO = new BigDecimal("5.25");

    @Override
    public BigDecimal obterCotacao() {
        return COTACAO_DOLAR_AMERICANO;
    }
}
