/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto */
package br.com.zup.Exercicio2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        //Recebendo valores do usuário
        System.out.println("Por favor digite o nome do produto");
        String nome = leitor.next();


        System.out.println("Por favor. digite o preço do produto");
        double preco = leitor.nextDouble();


        System.out.println("Por favor, digite a quantidade em estoque");
        int quantidade = leitor.nextInt();


        Produto produto = new Produto(nome, preco, quantidade);

        System.out.println("Digite  a quantidade de produtos que deseja adicionar");
        quantidade = leitor.nextInt();

        //Adcionando mais produtos ao estoque
        produto.addProdutos(quantidade);
        System.out.println(produto);


        System.out.println("Digite  a quantidade de produtos que deseja remover");
        quantidade = leitor.nextInt();

        //removendo quantidade de produto do estoque
        produto.removerProduto(quantidade);
        System.out.println(produto);


    }
}
