package EstruturaSequencial;

// Exercício 7
// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Ex7_Dobro_area_quadrado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a medida do lado do quadrado em centimetros: ");
        double l = input.nextDouble();

        double areaQuadrado = Math.pow(l, 2);

        System.out.println("Dobro da area (" + areaQuadrado + "cm) do quadrado: " + areaQuadrado*2 + "cm");
    }
}
