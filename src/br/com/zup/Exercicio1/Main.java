/* Questão em se pede o valor do triangulo e mostre qual dos x ou y é o maior entre eles */
package br.com.zup.Exercicio1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Triangulo x,y;

        //Instanciando o objeto x

        x = new Triangulo();

        //Instancia o objeto y

        y = new Triangulo();

        //Entrando os valores do usuário, guardando nos atributos
        System.out.println("Por favor, digite as medidas do triangulo X");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();

        System.out.println("Por favor, digite as medidas do triangulo Y");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();

        //Chamada do método para calcular a area do triangulo
        double areaX = x.area();
        double areaY = y.area();

        //Condição para saber qual triangulo é o maior 
        if (areaX > areaY) {
            System.out.println("O triangulo maior é o : X ");
        }
        else {
            System.out.println("O triangulo maior é o : Y ");
        }






    }
}
