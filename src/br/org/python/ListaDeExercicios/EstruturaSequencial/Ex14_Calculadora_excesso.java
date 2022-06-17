package br.org.python.ListaDeExercicios.EstruturaSequencial;

// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
// rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
// que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
// deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça
// um programa que leia a variável peso (peso de peixes) e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite e na variável
// multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Ex14_Calculadora_excesso {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o kilo de peixes pescados: ");
        double kilo = input.nextDouble();

        double excesso, multa;

        if (kilo < 0) {
            System.out.println("Valor inválido!");
        } else if (kilo > 50) {
            excesso = kilo-50;
            multa = excesso * 4.0;
            System.out.println("Excesso: " + excesso + "Kg");
            System.out.println("Multa: R$ " + multa);
        } else {
            System.out.println("Não houve excesso!");
        }
    }
}
