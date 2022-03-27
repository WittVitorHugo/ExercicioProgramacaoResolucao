package EstruturaSequencial;

import java.util.Scanner;

public class Ex3_Soma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        System.out.println("A soma resultou em: " + (numero1 + numero2));
    }
}
