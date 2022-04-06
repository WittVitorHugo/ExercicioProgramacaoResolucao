package EstruturaSequencial;

// Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
// quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para
// cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Ex16_Calculo_tinta {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o metro quadrado: ");
        double metroQuadrado = input.nextDouble();

        double qtdLata = metroQuadrado/3;
        if(qtdLata>18) {
            qtdLata /= 18;
        }

        System.out.println("Quantidade de Latas: " + Math.ceil(qtdLata));
        System.out.println("Custo: " + 80*Math.ceil(qtdLata));
    }
}
