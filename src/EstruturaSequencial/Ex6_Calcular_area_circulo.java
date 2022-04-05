package EstruturaSequencial;

// Exercício 6
// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class Ex6_Calcular_area_circulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o raio em centímetros: ");
		double raio = input.nextDouble();
		
		double area = 3.14159265359 * (Math.pow(raio, 2));
		
		System.out.format("Área de um circulo com raio de " + raio + " cm: " + String.format("%.2f", area) + " cm");
	}

}
