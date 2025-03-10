package com.jrpolesi.exercicio3;

public class Exercicio3 {
    static public void execute() {
        Produto produto = new Produto();

        produto.nome = "Novo produto";

        produto.alterarPreco(16.5);
        produto.alterarQuantidade(50);

        final var infoDoProduto = produto.exibirInformacoes();
        System.out.println(infoDoProduto);
    }
}