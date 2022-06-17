package br.org.python.ListaDeExercicios.EstruturaSequencial;

// Tendo como dados de entrada a altura de uma pessoa,
// construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

public class Ex12_Peso_ideal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura em cm: ");
        double altura = input.nextDouble();

        double pesoIdeal = (72.7*(altura/100)) - 58;

        System.out.println("Peso ideal: " + String.format("%.2f", pesoIdeal) + "Kg");
    }
}
