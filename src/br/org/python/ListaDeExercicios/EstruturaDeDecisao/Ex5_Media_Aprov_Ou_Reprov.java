package br.org.python.ListaDeExercicios.EstruturaDeDecisao;

/*
* Exercício 5
* Faça um programa para a leitura de duas notas parciais de um aluno.
* O programa deve calcular a média alcançada por aluno e apresentar:
* A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
* A mensagem "Reprovado", se a média for menor do que sete;
* A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Ex5_Media_Aprov_Ou_Reprov {

    public static String aprovadoOuReprovado(double n1, double n2) {

        double media = (n1 + n2)/2;

        if (media == 10d) return "Aprovado com Distincao";

        return (!(media <= 7d)) ? "Aprovado" : "Reprovado";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = input.nextDouble();

        if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
            System.out.println(aprovadoOuReprovado(n1, n2));
        } else {
            System.out.println("Notas invalidas!");
        }

        input.close();
    }
}
