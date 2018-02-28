package com.leandro.aula19.labs;

public class Exer18 {

    public static void main(String[] args) {
        int[] idades = new int[10];
        int menor = 0;
        int maior = 0;
        int indexMenor = 0;
        int indexMaior = 0;
        System.out.println("Idades: ");
        for (int i = 0, j = 34; i < 10; i++) {
            idades[i] = j;
            System.out.print(idades[i] + " ");
            if (i == 0) {
                menor = j;
                maior = j;
            }
            if (j < menor) {
                menor = j;
                indexMenor = i;
            }
            if (j > maior) {
                maior = j;
                indexMaior = i;
            }

            j = j + 3;
        }
        System.out.println("");
        System.out.println("A menor idade é: " + menor + " e sua posição é"
                + ": " + indexMenor);
        System.out.println("A maior idade é: " + maior + " e sua posição é: "
                + "" + indexMaior);
    }

}
