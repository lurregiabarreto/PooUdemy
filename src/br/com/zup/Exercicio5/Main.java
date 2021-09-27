/* (VETORES)
Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/
package br.com.zup.Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        Produtos[] vetor = new Produtos[n];

        for (int i = 0; i < vetor.length; i++) {
            leitor.nextLine();

            String nome = leitor.nextLine();
            double preco = leitor.nextDouble();

            vetor[i] = new Produtos(nome, preco);

        }
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();

        }
        double media = soma / vetor.length;
        System.out.println("A média dos preços dos produtos é : " +media);


    }
}
