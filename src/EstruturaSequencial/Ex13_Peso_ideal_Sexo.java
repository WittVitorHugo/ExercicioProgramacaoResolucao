package EstruturaSequencial;

// Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
// calcule seu peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Ex13_Peso_ideal_Sexo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura em cm: ");
        double altura = input.nextDouble();

        System.out.print("Digite o genero\n1-Masculino\n2-Feminino\n");
        int opcao = input.nextInt();

        double pesoIdeal = 0d;

        switch (opcao) {
            case 1:
                pesoIdeal = (72.7*(altura/100)) - 58;
                break;
            case 2:
                pesoIdeal = (62.1*altura/100) - 44.7;
                break;
            default:
                System.out.println("Genero inválido!");
        }

        System.out.println("Peso ideal: " + String.format("%.2f", pesoIdeal) + "Kg");
    }
}
