/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class Exer14 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************Medidor de tempo para download********************\n"
                + "Digite o tamanho do arquivo em MB, em seguida"
                + " digite a velocidade de sua conexão\nem mbps, separados por espaço ou Enter.");
        double tamArquivo = scan.nextDouble();
        double velConexao = scan.nextDouble();
        // O MB é 8 vezes maior que o Mb
        // 100MB * 8 = 800 mb
        double tamArquivoEmMegabit = tamArquivo * 8; // 800 mb
        double tempoDownloadEmSegundos = tamArquivoEmMegabit / velConexao;
        double tempoDwonloadPorMinuto = tempoDownloadEmSegundos / 60;
        System.out.println("O tempo de download para um arquivo de " + tamArquivo +" MB"
                + " é de " + tempoDownloadEmSegundos + "(s) ou " + tempoDwonloadPorMinuto + " minutos(s).");
    }
}
