package EstruturaSequencial;

// Exercicio 10
// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class Ex10_Celsius_Fahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite os graus Celsius: ");
        double c = input.nextDouble();

        double f = (9*c)/5+32;

        System.out.println("Celsius: " + String.format("%.2f", f) + "°");
    }
}
