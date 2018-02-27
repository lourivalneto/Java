package com.leandro.aula19.labs;

public class Exer13 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int cont = 0;
        int soma = 0;
        //int[] b = new int[10];
        //double[] c = new double[10];
        
        for (int i = 0; i < 10; i++) {
            a[i]  = (i+5);
            if(a[i]%5==0) {
                cont++;
                soma += a[i];
                System.out.print(a[i] + " ");
            }
            
        }
        System.out.println("\n" + cont + " números são múltiplos de 5.\n");
        System.out.println("A soma deles é: " + soma);
    }
}
