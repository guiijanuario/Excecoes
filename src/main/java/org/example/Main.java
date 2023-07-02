package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> verduras = new ArrayList<>();
        List<String> legumes = new ArrayList<>();
        List<String> graos = new ArrayList<>();
        List<String> outros = new ArrayList<>();

        Map<String, Double> quantidadesVerduras = new HashMap<>();
        Map<String, Integer> quantidadesLegumes = new HashMap<>();
        Map<String, Double> quantidadesGraos = new HashMap<>();
        Map<String, Integer> quantidadesOutros = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("=== MENU ===");
                System.out.println("1 - Incluir VERDURA");
                System.out.println("2 - Incluir LEGUME");
                System.out.println("3 - Incluir GRÃO");
                System.out.println("4 - Incluir OUTRO");
                System.out.println("0 - Encerrar");

                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe a quantidade em gramas: ");
                        String quantidadeVerduraStr = scanner.nextLine();
                        if (quantidadeVerduraStr.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                        }
                        double quantidadeVerdura;
                        try {
                            quantidadeVerdura = Double.parseDouble(quantidadeVerduraStr);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto");
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeVerdura = scanner.nextLine();
                        if (nomeVerdura.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
                        }

                        verduras.add(nomeVerdura);
                        quantidadesVerduras.put(nomeVerdura, quantidadeVerdura);
                        break;
                    case 2:
                        System.out.print("Informe a quantidade em unidades: ");
                        String quantidadeLegumeStr = scanner.nextLine();
                        if (quantidadeLegumeStr.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                        }
                        int quantidadeLegume;
                        try {
                            quantidadeLegume = Integer.parseInt(quantidadeLegumeStr);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("Para legume, a quantidade deve ser informada em unidades inteiras");
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeLegume = scanner.nextLine();
                        if (nomeLegume.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
                        }

                        legumes.add(nomeLegume);
                        quantidadesLegumes.put(nomeLegume, quantidadeLegume);
                        break;
                    case 3:
                        System.out.print("Informe a quantidade em gramas: ");
                        String quantidadeGraoStr = scanner.nextLine();
                        if (quantidadeGraoStr.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                        }
                        double quantidadeGrao;
                        try {
                            quantidadeGrao = Double.parseDouble(quantidadeGraoStr);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("Para grãos, a quantidade deve ser informada com ponto");
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeGrao = scanner.nextLine();
                        if (nomeGrao.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
                        }

                        graos.add(nomeGrao);
                        quantidadesGraos.put(nomeGrao, quantidadeGrao);
                        break;
                    case 4:
                        System.out.print("Informe a quantidade em unidades: ");
                        String quantidadeOutroStr = scanner.nextLine();
                        if (quantidadeOutroStr.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
                        }
                        int quantidadeOutro;
                        try {
                            quantidadeOutro = Integer.parseInt(quantidadeOutroStr);
                        } catch (NumberFormatException e) {
                            throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras");
                        }

                        System.out.print("Informe o nome do alimento: ");
                        String nomeOutro = scanner.nextLine();
                        if (nomeOutro.isEmpty()) {
                            throw new UnsupportedOperationException("Não é permitido inserir nome vazio");
                        }

                        outros.add(nomeOutro);
                        quantidadesOutros.put(nomeOutro, quantidadeOutro);
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }

                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
            } catch (UnsupportedOperationException | NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }

        System.out.println("Lista de compras:");

        System.out.println("Verduras:");
        for (String verdura : verduras) {
            System.out.println(verdura + " - " + quantidadesVerduras.get(verdura) + "g");
        }
        System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + verduras.size());
        System.out.println();

        System.out.println("Legumes:");
        for (String legume : legumes) {
            System.out.println(legume + " - " + quantidadesLegumes.get(legume) + " unidades");
        }
        System.out.println("A quantidade de alimentos do tipo legume a ser comprada é: " + legumes.size());
        System.out.println();

        System.out.println("Grãos:");
        for (String grao : graos) {
            System.out.println(grao + " - " + quantidadesGraos.get(grao) + "g");
        }
        System.out.println("A quantidade de alimentos do tipo grão a ser comprada é: " + graos.size());
        System.out.println();

        System.out.println("Outros:");
        for (String outro : outros) {
            System.out.println(outro + " - " + quantidadesOutros.get(outro) + " unidades");
        }
        System.out.println("A quantidade de alimentos do tipo outro a ser comprada é: " + outros.size());
    }
}