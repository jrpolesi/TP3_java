package com.jrpolesi.exercicio6;

public class Exercicio6 {
    static public void execute() {
        // Instancia um produto

        /*
            Quando instanciamos um objeto com construtor, podemos passar alguns
            parâmetros que podem ser utilizadas para a construção do objeto.
            No caso do Produto, usamos os parâmetros para popular os atributos
            nome, preco e quantidadeEmEstoque.

            Ao utilizar um construtor, também podemos utilizar lógicas para a
            criação do objeto, como validações.
        */
        Produto produto = new Produto(
                "Meu produto 1",
                13.75,
                18
        );

        final var infoDoProduto = produto.exibirInformacoes();
        System.out.println(infoDoProduto);

        /*
            Usar o construtor com parâmetros garante que o objeto seja
            instanciado com os atributos necessários, reduz a quantidade
            de código para inicializar um objeto, deixa o código mais legível,
            pois obriga informar os atributos todos juntos, e por fim, ajuda
            na criação de objetos imutáveis.
         */
    }
}