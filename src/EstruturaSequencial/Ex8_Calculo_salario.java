package EstruturaSequencial;

// Exercicio 8
// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Ex8_Calculo_salario {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de horas de trabalho no mes: ");
        int cargaHoraria = input.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double salarioPorHora = input.nextDouble();

        double salario = salarioPorHora * cargaHoraria;

        System.out.println("Salario: " + salario);
    }
}
