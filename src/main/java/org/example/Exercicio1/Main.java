package org.example.Exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaDeCompras listaCompra = new ListaDeCompras();
        ListaComprasController listaCompraController = new ListaComprasController();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            try {

                    System.out.println("===================================== MENU =========================================");
                    System.out.println("Que tipo de alimento você quer acrescentar na lista de compras?");
                    System.out.println("1 - Verduras");
                    System.out.println("2 - Legumes");
                    System.out.println("3 - Grãos");
                    System.out.println("4 - Outros ");
                    System.out.println("5 - Para visualizar a lista ");
                    System.out.println("X - Para sair ");
                    System.out.print("Digite -> ");
                    String opcao = new Scanner(System.in).nextLine().toLowerCase();



                switch (opcao) {
                    case "1":
                        System.out.print("\nVocê escolheu Verdura!\n");

                        double quantidadeVerdura = 0.0;
                        boolean entradaValida = false;
                        while (!entradaValida) {

                            System.out.print("Informe a quantidade em gramas: ");
                            String entrada = scanner.nextLine();

                            try {
                                quantidadeVerdura = Double.parseDouble(entrada);
                                entradaValida = true;

                            } catch (NumberFormatException e) {
                                System.out.println("[---------------------------------------------------------------------]\n" +
                                        "     Para verdura, a quantidade deve ser informada com ponto.\n" +
                                        "     " + e.fillInStackTrace() + "\n" +
                                        "[---------------------------------------------------------------------]");
                            }
                        }

                        if(quantidadeVerdura <= 0) {
                            System.out.printf("Erro: Não é possível inserir número negativos ou zero");
                            System.out.printf("\nInforme novamente a quantidade em gramas: ");
                            quantidadeVerdura = scanner.nextDouble();
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeVerdura = scanner.nextLine();


                        listaCompra.addAlimento(listaCompraController.criarVerdura(nomeVerdura, quantidadeVerdura));

                        break;
                    case "2":
                        System.out.print("\nVocê escolheu Legumes!\n");

                        System.out.print("Informe a quantidade em unidades: ");
                        double quantidadeLegume = scanner.nextDouble();
                        scanner.nextLine();

                        if(quantidadeLegume <= 0) {
                            System.out.printf("Erro: Não é possível inserir número negativos ou zero");
                            System.out.printf("\nInforme novamente a quantidade em gramas: ");
                            quantidadeLegume = scanner.nextDouble();

                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeLegume = scanner.nextLine();

                        listaCompra.addAlimento(listaCompraController.criarLegume(nomeLegume, quantidadeLegume));
                        break;
                    case "3":
                        System.out.print("\nVocê escolheu Grãos!\n");

                        double quantidadeGrao = 0.0;
                        boolean entradaValidaG = false;
                        while (!entradaValidaG) {

                            System.out.print("Informe a quantidade em gramas: ");
                            String entrada = scanner.nextLine();

                            try {
                                quantidadeGrao = Double.parseDouble(entrada);
                                entradaValidaG = true;

                            } catch (NumberFormatException e) {
                                System.out.println("[---------------------------------------------------------------------]\n" +
                                        "     Para grãos, a quantidade deve ser informada com ponto.\n" +
                                        "     " + e.fillInStackTrace() + "\n" +
                                        "[---------------------------------------------------------------------]");
                            }
                        }

                        if(quantidadeGrao <= 0) {
                            System.out.printf("Erro: Não é possível inserir número negativos ou zero");
                            System.out.printf("\nInforme novamente a quantidade em gramas: ");
                            quantidadeGrao = scanner.nextDouble();
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeGrao = scanner.nextLine();

                        listaCompra.addAlimento(listaCompraController.criarGrao(nomeGrao, quantidadeGrao));
                        break;
                    case "4":
                            System.out.print("\nVocê escolheu Outros!\n");

                            System.out.print("Informe a quantidade em unidades: ");
                            double quantidadeOutros = scanner.nextDouble();
                            scanner.nextLine();

                            if(quantidadeOutros <= 0) {
                                System.out.printf("Erro: Não é possível inserir número negativos ou zero");
                                System.out.printf("\nInforme novamente a quantidade em gramas: ");
                                quantidadeOutros = scanner.nextDouble();
                            }

                            System.out.print("Informe o nome do alimento: ");
                            String nomeOutros = scanner.nextLine();


                            listaCompra.addAlimento(listaCompraController.criarOutros(nomeOutros, quantidadeOutros));
                        break;
                    case "5":
                        listaCompra.exibirListaCompras();
                        break;
                    case "x":
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println();

            }
        }

        listaCompra.exibirListaCompras();
    }

}

