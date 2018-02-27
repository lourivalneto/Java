package com.leandro.aula20.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o ano que você quer usar para a agenda?");
        int ano = scan.nextInt();
        boolean bissexto = false;
        boolean validaRepeticao = true;
        int fevereiro = 0;

        int menu = 0;
        int mes = 0;
        int dia = 0;
        int hora = 0;

        String[][][] agendaAno = new String[12][][];

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            bissexto = true;
        }
        if (bissexto) {
            fevereiro = 29;
        } else {
            fevereiro = 28;
        }

        for (int i = 0; i < 12; i++) {
            if (i == 1) {
                agendaAno[i] = new String[fevereiro][24];
            } else if (i % 2 == 0 && i != 1) {
                agendaAno[i] = new String[31][24];
            } else {
                agendaAno[i] = new String[30][24];
            }
        } // até aqui montei agendaAno[12][xx][24]

        do {
            System.out.println("Você quer editar a agenda ou consultar? (1-editar, 2-consultar e 3-sair.)");
            menu = scan.nextInt();

            if (menu != 1 & menu != 2 & menu != 3) {
                do {
                    System.out.println("Opção inválida. Tente novamente.\n"
                            + "Você quer editar a agenda ou consultar? (1-editar, 2-consultar e 3-sair.)");
                    menu = scan.nextInt();

                } while (menu != 1 & menu != 2 & menu != 3);
            }

            if (menu == 1) {
                System.out.println("Digite o mês, o dia e a hora separados por espaço ou enter.");
                mes = scan.nextInt();
                scan.nextLine();
                dia = scan.nextInt();
                scan.nextLine();
                hora = scan.nextInt();
                scan.nextLine();

                if (mes == 2 && dia > fevereiro) {
                    do {
                        System.out.println("Você digitou um dia acima do limite para o mês de Fevereiro"
                                + "\nTente novamente. Digite o mês, o dia e a hora separados por espaço ou enter.");
                        mes = scan.nextInt();
                        scan.nextLine();
                        dia = scan.nextInt();
                        scan.nextLine();
                        hora = scan.nextInt();
                        scan.nextLine();
                    } while (mes == 2 && dia > fevereiro);
                }

                System.out.println("Digite o compromisso para o mês " + mes + ", para o dia " + dia + " e para as " + hora + " horas.");
                agendaAno[mes - 1][(dia - 1)][(hora)] = scan.nextLine();
                System.out.println("Edição da Agenda: \nO compromisso do mês " + mes + ", do dia " + dia + " e das " + hora + " horas:"
                        + " " + agendaAno[mes - 1][dia - 1][hora]);
            }

            if (menu == 2) {
                System.out.println("Digite o mês, o dia e a hora separados por espaço ou enter.");
                mes = scan.nextInt();
                dia = scan.nextInt();
                hora = scan.nextInt();
                System.out.println("Contulta da Agenda: \nO compromisso do mês " + mes + ", do dia " + dia + " e da hora " + hora + ":"
                        + " " + agendaAno[mes - 1][dia - 1][hora]);
            }

            if (menu == 3) {
                System.out.println("Programa finalizado. Até breve.");
                validaRepeticao = false;
            }
        } while (validaRepeticao);
    }

}
