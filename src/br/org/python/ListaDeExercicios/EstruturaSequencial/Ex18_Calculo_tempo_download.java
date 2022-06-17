package br.org.python.ListaDeExercicios.EstruturaSequencial;

// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
// velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
// de download do arquivo usando este link (em minutos).

import java.time.Duration;
import java.util.Scanner;

public class Ex18_Calculo_tempo_download {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double mb = input.nextDouble();
        System.out.print("Digite a velocidade do link em Mbps: ");
        double mbps = input.nextDouble();

        double tempoDeDownload = mb/(mbps/8);

        Duration total = Duration.ofSeconds((long) tempoDeDownload);

        System.out.println("Tempo download: " + String.format("%d",
                total.toHoursPart()) + ":" + String.format("%d",
                total.toMinutesPart()) + ":" + String.format("%d",
                total.toSecondsPart()));
    }
}
