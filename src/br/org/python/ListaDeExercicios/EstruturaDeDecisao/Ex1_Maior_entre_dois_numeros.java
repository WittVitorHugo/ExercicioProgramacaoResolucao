package br.org.python.ListaDeExercicios.EstruturaDeDecisao;

/*
* Exercício 1
* Faça um Programa que peça dois números e imprima o maior deles.
 */

import java.util.Scanner;

public class Ex1_Maior_entre_dois_numeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = scanner.nextInt();

        System.out.println(Integer.max(n1,n2));
    }
}
