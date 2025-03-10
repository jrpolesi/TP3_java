package com.jrpolesi.exercicio2;

public class Produto {
    /**
     * Nome do produto, usado para identificar o produto de maneira legível.
     */
    String nome;
    /**
     * Preço do produto, usado para identificar o preço do produto.
     */
    double preco;
    /**
     * Quantidade em estoque do produto, usada para identificar a quantidade de produtos disponíveis.
     * Dessa forma, é possível impedir que um produto seja vendido caso não haja estoque.
     */
    int quantidadeEmEstoque;
}
