package com.jrpolesi.exercicio5;

public class Exercicio5 {
    static public void execute() {
        // Instancia um produto
        Produto produto = new Produto();

        // Atribui os valores usando setters
        produto.setNome("Meu novo produto");
        produto.setPreco(11.20);
        produto.setQuantidadeEmEstoque(5);

        // Exibe as informações do produto usando getters
        final var infoDoProduto = String.format("Nome: %s\nPreço: %.2f\nEstoque: %d", produto.getNome(), produto.getPreco(), produto.getQuantidadeEmEstoque());
        System.out.println(infoDoProduto);

        /*
            O uso de getters e setters permite encapsular os atributos de uma classe,
            adicionando lógica de acesso e modificação, como validações e tratamento
            de exceções, dessa forma, contribuindo para a consistência dos dados.

            Além disso, getters e setters, criam um uníco ponto de acesso e
            modificação dos atributos, ajudando em alterações futuras sem a
            necessidade de alterar o código em diversos pontos, e facilitando
            o log de modificação de atributos.
         */
    }
}