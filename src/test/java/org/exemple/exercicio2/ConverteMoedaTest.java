package org.exemple.exercicio2;

import org.example.Exercicio2.ConverteMoeda;
import org.example.Exercicio2.DolarAmericano;
import org.example.Exercicio2.Moeda;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverteMoedaTest {
    @Test
    public void testandoSeAconversaoEstaMultiplicando() {

        Moeda moeda = Mockito.mock(Moeda.class);

        Mockito.when(moeda.obterCotacao()).thenReturn(new BigDecimal("5.25"));

        ConverteMoeda converteMoeda = new ConverteMoeda();

        BigDecimal valorConvertido = converteMoeda.converterMoeda(new BigDecimal("10"), moeda.obterCotacao());

        assertEquals(new BigDecimal("52.50"), valorConvertido);
    }

    @Test
    public void testObterNomeMoeda() {

        Moeda moeda = Mockito.mock(DolarAmericano.class);

        ConverteMoeda converteMoeda = new ConverteMoeda();

        String nomeMoeda = converteMoeda.obterNomeMoeda(moeda);

        assertEquals("Dólar americano", nomeMoeda);
    }
}
