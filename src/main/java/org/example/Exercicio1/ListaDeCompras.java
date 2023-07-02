package org.example.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

    private List<Alimento> verduras = new ArrayList<>();
    private List<Alimento> legumes = new ArrayList<>();
    private List<Alimento> graos = new ArrayList<>();

    private List<Alimento> outrosLista = new ArrayList<>();


    public List<Alimento> getVerduras() {
        return verduras;
    }

    public List<Alimento> getLegumes() {
        return legumes;
    }

    public List<Alimento> getGraos() {
        return graos;
    }

    public List<Alimento> getOutrosLista() {
        return outrosLista;
    }

    //Recebe uma instância de um alimento sendo ela, Verdura, Legume e Grao, se o alimento que recebermos no parametro foi igual a...
    // instancia que estamos esperando vamos cadastrar na lista respectiva.
    public void addAlimento(Alimento alimento){
        if (alimento instanceof Verdura) verduras.add(alimento);

        if (alimento instanceof Legume) legumes.add(alimento);

        if (alimento instanceof Grao) graos.add(alimento);

        if (alimento instanceof Outros) outrosLista.add(alimento);
    }

    public void exibirListaCompras() {
        System.out.println("Lista de compras:");

        System.out.println("Verduras:");
        for (Alimento verdura : verduras) {
            System.out.println(verdura.getNome() + " - " + verdura.getQuantidade());
        }
        System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + verduras.size());
        System.out.println();

        System.out.println("Legumes:");
        for (Alimento legume : legumes) {
            System.out.println(legume.getNome() + " - " + legume.getQuantidade());
        }
        System.out.println("A quantidade de alimentos do tipo legume a ser comprada é: " + legumes.size());
        System.out.println();

        System.out.println("Grãos:");
        for (Alimento grao : graos) {
            System.out.println(grao.getNome() + " - " + grao.getQuantidade());
        }
        System.out.println("A quantidade de alimentos do tipo verdura a ser comprada é: " + graos.size());
        System.out.println();

        System.out.println("Outros:");
        for (Alimento outros : outrosLista) {
            System.out.println(outros.getNome() + " - " + outros.getQuantidade());
        }
        System.out.println("A quantidade de alimentos do tipo outros a ser comprada é: " + outrosLista.size());
        System.out.println();
    }

}
