package com.leandro.aula20.labs;

public class Exer02 {

    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        int maior = 0;
        int menor = 0;
        int maiorPosI = 0;
        int maiorPosJ = 0;
        int menorPosI = 0;
        int menorPosJ = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < numeros.length; i++) {
            for (j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 10);

                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");

        }

        for (int k = 0; k < numeros.length; k++) {
            for (int l = 0; l < numeros[k].length; l++) {
                if (k == 4 && l == 0) {
                    maior = numeros[k][l];
                    menor = numeros[k][l];
                    maiorPosI = k;
                    maiorPosJ = l;
                    menorPosI = k;
                    menorPosJ = l;
                }
                if (k == 4 && numeros[k][l] > maior) {
                    maior = numeros[k][l];
                    maiorPosI = k;
                    maiorPosJ = l;
                } else if (k == 4 && numeros[k][l] < menor) {
                    menor = numeros[k][l];
                    menorPosI = k;
                    menorPosJ = l;
                }

                if (k == 4 && l == 9) {
                    System.out.println("O maior número aleatório entre 0 e 9 da Quinta linha é " + maior);
                    System.out.println("A posição do maior número "
                            + "da quinta linha é i[" + maiorPosI + "]j[" + maiorPosJ + "].");
                    System.out.println("O menor número aleatório entre 0 e 9 da Quinta linha é " + menor);
                    System.out.println("A posição do menor número "
                            + "da quinta linha é i[" + menorPosI + "]j[" + menorPosJ + "].");
                }
            }

        }
        System.out.println("");
        int maiorC7 = 0;
        int menorC7 = 0;
        int col7 = 6;
        for (int k = 0; k < numeros.length; k++) {
            if(numeros[k][col7] > maiorC7){
                maiorC7 = numeros[k][col7];
            }
            if(numeros[k][col7] < menorC7) {
                menorC7 = numeros[k][col7];
            }
            
        }
        System.out.println("Maior valor da coluna 7 é: " + maiorC7);
        System.out.println("Menor valor da coluna 7 é: " + menorC7);

    }

}
