package br.org.python.ListaDeExercicios.EstruturaDeDecisao;

/*
* Exercício 2
* Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

import java.util.Scanner;

public class Ex2_Positivo_ou_negativo {

    public static String Positivo_Ou_Negativo(int n) {
        if (n == 0)
            return "Número igual a zero!";
        return (n < 0) ? "Número Negativo!" : "Número Positivo!";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println(Positivo_Ou_Negativo(num));
    }
}
