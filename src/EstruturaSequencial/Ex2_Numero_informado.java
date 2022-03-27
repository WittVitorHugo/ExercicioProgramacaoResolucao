package EstruturaSequencial;

import java.util.Scanner;

public class Ex2_Numero_informado {

    public static void main(String[] args) {

        System.out.print("Digite um número: ");

        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        System.out.println("O númeo informado foi " + numero);
    }
}
