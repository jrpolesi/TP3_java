package com.jrpolesi.exercicio4;

public class Exercicio4 {
    static public void execute() {
        // Instancia um produto
        Produto produto = new Produto();

        // Atribui os valores iniciais
        produto.nome = "Meu produto";
        produto.preco = 15.0;
        produto.quantidadeEmEstoque = 10;

        // Altera o preço e a quantidade
        produto.alterarPreco(17.45);
        produto.alterarQuantidade(9);

        final var infoDoProduto = produto.exibirInformacoes();
        System.out.println(infoDoProduto);
    }
}