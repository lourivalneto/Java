package com.leandro.aula19.labs;

public class Exer11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int cont = 0;
        //int[] b = new int[10];
        //double[] c = new double[10];
        
        for (int i = 0; i < 10; i++) {
            a[i]  = i;
            if(a[i]%2==0){
                cont++;
            }
            
            //b[i] = a[i] % 2;
            //c[i] = a[i] / b[i];
            //System.out.print("Vetor a: " + a[i] + "\n");
            //System.out.print("Vetor b: " + b[i] + "\n");
            //System.out.print("Vetor c: " + c[i] + "\n");
        }
        System.out.print(cont + " números são pares.\n");
    }
}
