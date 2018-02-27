package com.leandro.aula20.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] agendaMes = new String[31][24]; // de 0 a 30 e de 0 a 23, porque quando chega na 24ª, conta 
        // como zero.
        boolean validaRepeticao = true;
        int menu = 0;
        int dia = 0;
        int hora = 0;
        String compromisso = "";

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
                boolean horaValida = false;
                boolean diaValido = false;
                while(!horaValida && !diaValido){
                    System.out.println("Digite o dia e a hora separados por espaço ou enter.");
                    dia = scan.nextInt();
                    scan.nextLine();
                    hora = scan.nextInt();
                    scan.nextLine();
                    if((dia > 0 && dia <= 31) && (hora  > -1 && hora <= 23)) {
                        horaValida = true;
                        diaValido = true;
                    } else {
                        System.out.println("Dia e/ou hora inválido(s). Dias válidos"
                                + " de 1 a 31 e horas válidas de 0 a 23 (24 é referenciada por 0)."
                                + "\nTente novamente.");
                    }
                }
                System.out.println("Digite o compromisso para o dia " + dia + " e para a hora " + hora);
                    agendaMes[(dia - 1)][(hora)] = scan.nextLine();
                    System.out.println("Edição da Agenda: \nO compromisso do dia " + dia + " e da hora " + hora + ":"
                            + " " + agendaMes[dia - 1][hora]); 
                
            }

            if (menu == 2) {
                System.out.println("Digite o dia e a hora separados por espaço ou enter.");
                dia = scan.nextInt();
                hora = scan.nextInt();
                System.out.println("Contulta da Agenda: \nO compromisso do dia " + dia + " e da hora " + hora + ":"
                        + " " + agendaMes[dia - 1][hora]);
            }

            if (menu == 3) {
                System.out.println("Programa finalizado. Até breve.");
                validaRepeticao = false;
            }
        } while (validaRepeticao);
    }

}
