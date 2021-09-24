/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação. */
package br.com.zup.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Conta conta;

        System.out.println("Digite o numero da sua conta");
        int numero = leitor.nextInt();

        System.out.println("Digite por favor o nome do titular");
        leitor.nextLine();
        String titular = leitor.nextLine();

        System.out.println("Possui algum valor de depósito inicial ? S/N");
        char resposta = leitor.next().charAt(0);

        if (resposta == 'S') {
            System.out.println("Por favor digite o valor do depósito inicial");
            double depositoInicial = leitor.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);

        }

        System.out.println("Dados da conta");
        System.out.println(conta);

        //Depositar
        System.out.println("Digite o valor do depósito");
        double valorDeposito = leitor.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Valor atualizado da conta");
        System.out.println(conta);

        //Sacar
        System.out.println("Digite o valor do saque");
        double valorsaque = leitor.nextDouble();
        conta.sacar(valorsaque);
        System.out.println("Valor atualizado da conta");
        System.out.println(conta);




    }


}

