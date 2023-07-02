package org.example.Exercicio2;

import java.math.BigDecimal;

public class LibraEsterlina implements Moeda{

    private final BigDecimal COTACAO_LIBRA_ESTERLINA = new BigDecimal("7.50");

    @Override
    public BigDecimal obterCotacao() {
        return COTACAO_LIBRA_ESTERLINA;
    }
}
