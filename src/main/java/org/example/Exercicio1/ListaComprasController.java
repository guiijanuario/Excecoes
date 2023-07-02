package org.example.Exercicio1;

public class ListaComprasController {

    public Alimento criarVerdura(String nome, double quantidade){
        if (nome.equalsIgnoreCase("")){
            throw new UnsupportedOperationException("\n[-------------------------------------------------------------]\n" +
                    "          Error: Não é permitido inserir valor vazio!\n" +
                    "[-------------------------------------------------------------]");
        }


        System.out.println(nome + " Cadastrado com sucesso!");
        return new Verdura(nome, quantidade);
    }


    public Alimento criarLegume(String nome, double quantidade){
        if(quantidade != (int)quantidade){
            throw new NumberFormatException("\n[---------------------------------------------------------------------]\n" +
                    "Error: Para legume, a quantidade deve ser informada em unidade inteiras\n" +
                    "[---------------------------------------------------------------------]");
        }

        if (nome.equalsIgnoreCase("")){
            throw new UnsupportedOperationException("\n[-------------------------------------------------------------]\n" +
                    "          Error: Não é permitido inserir valor vazio!\n" +
                    "[-------------------------------------------------------------]");
        }


        System.out.println(nome + " Cadastrado com sucesso!");
        return new Legume(nome, (int)quantidade);
    }

    public Alimento criarGrao(String nome, double quantidade){
        if (nome.equalsIgnoreCase("")){
            throw new UnsupportedOperationException("\n[-------------------------------------------------------------]\n" +
                    "          Error: Não é permitido inserir valor vazio!\n" +
                    "[-------------------------------------------------------------]");
        }


        System.out.println(nome + " Cadastrado com sucesso!");
        return new Grao(nome, quantidade);
    }

    public Alimento criarOutros(String nome, double quantidade){
        if(quantidade != (int)quantidade){
            throw new NumberFormatException("\n[-------------------------------------------------------------]\n" +
                    "Error: Para alimento Outros, a quantidade deve ser informada em unidade inteiras\n" +
                    "[-------------------------------------------------------------]");
        }

        if (nome.equalsIgnoreCase("")){
            throw new UnsupportedOperationException("\n[-------------------------------------------------------------]\n" +
                    "          Error: Não é permitido inserir valor vazio!\n" +
                    "[-------------------------------------------------------------]");
        }

        System.out.println(nome + " Cadastrado com sucesso!");
        return new Outros(nome, (int)quantidade);
    }
}
