package br.org.python.ListaDeExercicios.EstruturaSequencial;

// Exercicio 9
// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
// C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class Ex9_Fahrenheit_para_Celsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os graus Fahrenheit: ");
        double f = input.nextDouble();

        double c = 5 * ((f-32)/9);

        System.out.println("Celsius: " + String.format("%.2f", c) + "°");
    }
}
