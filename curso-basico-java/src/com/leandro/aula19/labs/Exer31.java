package com.leandro.aula19.labs;

public class Exer31 {

    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = new int[20];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 20; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
            if (a[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int j = 0;
        for (int i = 0; i < 20; i++) {
            
            if (a[i] % 2 == 0) {
                
                b[j] = a[i];
                System.out.println("B[" + j + "] = " + b[j]);
                j++;
                

            } // ATÉ AQUI, AS 10 PRIMEIRAS POSIÇÕES DE B ESTARÃO PREENCHIDAS
        }
        j = contPar;
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                
                b[j] = a[i];
                System.out.println("B[" + j + "] = " + b[j]);
                j++;
                
            }
        }
        System.out.println("Pares: " + contPar + "\nÍmpares: " + contImpar);
    }

}
