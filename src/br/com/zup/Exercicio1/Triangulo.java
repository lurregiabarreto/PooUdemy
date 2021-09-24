package br.com.zup.Exercicio1;

//Triangulo é o nome da Classe
public class Triangulo {

    //atributos do triangulo
    public double a;
    public double b;
    public double c;

    //Criando o Método

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Math.sqrt é raiz quadrada da função

    }


}
