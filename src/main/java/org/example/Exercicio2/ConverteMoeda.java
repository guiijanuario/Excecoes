package org.example.Exercicio2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ConverteMoeda {
    private Moeda[] moedas = {new DolarAmericano(), new DolarCanadense(), new Euro(), new LibraEsterlina()};


    public Moeda obterMoeda(int opcao) {
        if (opcao < 0 || opcao > moedas.length) {
            throw new IllegalArgumentException("Tipo de moeda inválido");
        }
        return moedas[opcao];
    }

    public BigDecimal obterCotacao(Moeda moeda) {
        return moeda.obterCotacao();
    }

    public BigDecimal converterMoeda(BigDecimal valor, BigDecimal cotacao) {
        return valor.multiply(cotacao);
    }

    public void mostrarResultado(Moeda moeda, BigDecimal cotacao, BigDecimal valor, BigDecimal valorConvertido, DecimalFormat decimalFormat) {
        System.out.println("A " + obterNomeMoeda(moeda) + " na cotação de hoje está em " + decimalFormat.format(cotacao) +
                ", o valor que pediu para converter de " + decimalFormat.format(valor) + " em reais é R$ " +
                decimalFormat.format(valorConvertido));
    }

    public String obterNomeMoeda(Moeda moeda) {
        if (moeda instanceof DolarAmericano) {
            return "Dólar americano";
        } else if (moeda instanceof DolarCanadense) {
            return "Dólar canadense";
        } else if (moeda instanceof Euro) {
            return "Euro";
        } else if (moeda instanceof LibraEsterlina) {
            return "Libra Esterlina";
        } else {
            throw new IllegalArgumentException("Tipo de moeda inválido");
        }

    }
}
