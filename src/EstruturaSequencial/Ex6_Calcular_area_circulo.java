package EstruturaSequencial;

// Exerc�cio 6
// Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

import java.util.Scanner;

public class Ex6_Calcular_area_circulo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o raio em cent�metros: ");
		double raio = input.nextDouble();
		
		double area = 3.14159265359 * (Math.pow(raio, 2));
		
		System.out.format("�rea de um circulo com raio de " + raio + " cm: " + String.format("%.2f", area) + " cm");
	}

}
