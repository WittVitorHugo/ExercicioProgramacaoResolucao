package br.org.python.ListaDeExercicios.EstruturaDeDecisao;

/*
* Exercício 3
* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
* Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

import java.util.Scanner;

public class Ex3_Masculino_Feminino {

    private static String Verifica_Sexo(String str) {
        return (str.equals("m")) ? "Masculino" : "Feminino";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sexo (F ou M): ");
        String str = scanner.nextLine();

        str = str.toLowerCase();

        System.out.println((str.equals("f") || str.equals("m")) ? Verifica_Sexo(str) : "Sexo invalido!");



    }
}
