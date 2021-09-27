/* (VETORES)
Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas. */
package br.com.zup.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = leitor.nextDouble();


        }
        double soma = 0.0;
        for (int i = 0 ; i < n ; i++)
        soma += vetor [i];
        double media = soma / n;
        System.out.println("A média das alturas é : " +media);
    }
}
