package br.org.python.ListaDeExercicios.EstruturaSequencial;

/*
  Exercício 5
  Faça um Programa que converta metros para centímetros.
 */

import java.util.Scanner;

public class Ex5_Converter_metros_em_cm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = input.nextDouble();

        System.out.println("Resultado: " + metros*100 + "cm");
    }
}
