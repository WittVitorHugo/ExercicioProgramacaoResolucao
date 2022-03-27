package EstruturaSequencial;

import java.util.Scanner;

public class Ex4_Media_bimestral {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double sum = 0;
        double media;

        for(int i=0; i<4; i++) {
            int posicao = i;
            System.out.print("Digite a " + ++posicao + "ª nota: ");
            notas[i] = input.nextDouble();
        }
        for(double value : notas) {
            sum += value;
        }

        media = sum/notas.length;

        System.out.println(media);
    }
}
