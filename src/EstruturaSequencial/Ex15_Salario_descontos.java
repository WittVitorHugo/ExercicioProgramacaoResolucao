package EstruturaSequencial;

// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para
// o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//      -salário bruto.
//      -quanto pagou ao INSS.
//      -quanto pagou ao sindicato.
//      -o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//      + Salário Bruto : R$
//      - IR (11%) : R$
//      - INSS (8%) : R$
//      - Sindicato ( 5%) : R$
//      = Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

import java.util.Scanner;

public class Ex15_Salario_descontos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de horas de trabalho no mes: ");
        int cargaHoraria = input.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        double salarioPorHora = input.nextDouble();

        double salario = salarioPorHora * cargaHoraria;
        double ir = (salario/100)*11;
        double inss = (salario/100)*8;
        double sindicato = (salario/100)*5;
        double salarioLiquido = salario-ir-inss-sindicato;

        System.out.println("Salario bruto: R$ " + salario);
        System.out.println("IR:            R$ " + ir);
        System.out.println("INSS:          R$ " + inss);
        System.out.println("Sindicato:     R$ " + sindicato);
        System.out.println("INSS:          R$ " + salarioLiquido);
    }
}
