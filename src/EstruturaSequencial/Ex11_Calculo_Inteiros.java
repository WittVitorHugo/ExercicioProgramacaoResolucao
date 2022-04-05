package EstruturaSequencial;

// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
// o produto do dobro do primeiro com metade do segundo.
// a soma do triplo do primeiro com o terceiro.
// o terceiro elevado ao cubo.

import java.util.Scanner;

public class Ex11_Calculo_Inteiros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero (inteiro): ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo numero (inteiro): ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro numero (real): ");
        double valorReal = input.nextDouble();

        double calculo1 = (valor1*2)*(valor2/2);
        double calculo2 = (valor1*3)+(valorReal);
        double calculo3 = Math.pow(valorReal, 3);

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + calculo1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + calculo2);
        System.out.println("O terceiro elevado ao cubo: " + calculo3);
    }
}
