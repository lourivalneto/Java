package com.leandro.aula19.labs;

public class Exer16 {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 11;
        a[1] = 57;
        a[2] = 61;
        a[3] = 40;
        a[4] = 39;
        a[5] = 21;
        a[6] = 7;
        a[7] = 9;
        a[8] = 15;
        a[9] = 14;
        int somaMenor15 = 0;
        int conta15 = 0;
        int contaMaior15 = 0;
        int somaMaior15 = 0;
        double mediaMaior15 = 0;

        for (int i = 0; i < 10; i++) {
            if(a[i] < 15) {
               somaMenor15 += a[i]; 
            } else if(a[i] == 15) {
               conta15++; 
            } else if(a[i] > 15) {
               somaMaior15 += a[i];
               contaMaior15++;
            }
        }
        mediaMaior15 = somaMaior15 / contaMaior15;
        System.out.println("a) A soma dos elementos menores que 15 é: " + somaMenor15);
        
        System.out.println("b) A qtd. de elementos iguais a 15 é: " + conta15);
        
        System.out.println("c) A média dos elementos maiores que 15 é: " + mediaMaior15);

    }

}
