package EstruturaSequencial;

// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
// da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
// e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga
// e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;

public class Ex17_Calculo_tinta_melhorado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o metro quadrado: ");
        double metroQuadrado = input.nextDouble();

        double qtdLitros = metroQuadrado/6;
        int lata18=0, lata3_6=0;
        double qtdLitrosReal = qtdLitros;

        while(qtdLitros>0) {
            if (qtdLitros>18) {
                qtdLitros -= 18;
                lata18++;
            }
            if (qtdLitros<18) {
                qtdLitros -= 3.6;
                lata3_6++;
            }
        }

        if (lata3_6 == 5 && lata18 == 0) {
            lata18 = 1;
            lata3_6 = 0;
        }


        double custoTotal = (lata3_6*25) + (lata18*80);

        System.out.println("Metro quadrado: " + String.format("%.2f", qtdLitrosReal));
        System.out.println("Quantidade de Latas de 18 litros: " + lata18);
        System.out.println("Custo latas de 18: " + lata18*80);
        System.out.println("Quantidade de Latas de 3.6 litros: " + lata3_6);
        System.out.println("Custo latas de 3.6: " + lata3_6*25);
        System.out.println("Custo total: " + custoTotal);
    }
}
