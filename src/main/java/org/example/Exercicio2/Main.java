package org.example.Exercicio2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        ConverteMoeda converter = new ConverteMoeda();

        boolean continuar = true;

        while (continuar) {
            try {

                System.out.println("[------------------------------------]");
                System.out.println("  Boas vindos ao conversor de moedas");
                System.out.println("[------------------------------------]");
                System.out.println("Qual moeda você quer converter?");
                System.out.println("\n1 - Dólar Americano");
                System.out.println("2 - Dólar Canadense");
                System.out.println("3 - Euro");
                System.out.println("4 - Libra Esterlina");
                System.out.println("5 - Sair");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                if(opcao == 5) {
                    continuar = false;
                }

                opcao = opcao - 1;

                Moeda moeda = converter.obterMoeda(opcao);

                System.out.println("Informe o valor a ser convertido:");
                BigDecimal valor = new BigDecimal(scanner.nextLine());

                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new IllegalArgumentException("Valor inválido, por favor, tente novamente");
                }

                BigDecimal cotacao = converter.obterCotacao(moeda);
                BigDecimal valorConvertido = converter.converterMoeda(valor, cotacao);

                converter.mostrarResultado(moeda, cotacao, valor, valorConvertido, decimalFormat);

                System.out.println("Deseja fazer outra conversão? (S/N)");
                String resposta = scanner.nextLine();

                if (!resposta.equalsIgnoreCase("S")) {
                    continuar = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, tente novamente." + " [" + e.fillInStackTrace() + "]");
                scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Erro: Para moeda, o valor monetário deve ser um número decimal." + " [" + e.fillInStackTrace() + "]");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
