package com.leandro.aula19.labs;

public class Exer30 {

    public static void main(String[] args) {
        int[] a = new int[20];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 20; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
            
            if (i == 10){
                System.out.println("");
            } 
            
            System.out.print("A[" + i + "]= " + a[i] + "; "); //Até aqui imprime os valores de A
            
            if (a[i] % 2 == 0) {
                contPar++; // incrementa contador de pares.
            } else {
                contImpar++; // incrementa contador de ímpares.
            }
        }
        System.out.println("");
        System.out.println("");
        int[] b = new int[contPar];
        int[] c = new int[contImpar];
        
        int j = 0;
        int k = 0;
        int l = 0;
        for (j = 0; j < 20; j++) {
            if(a[j] % 2 == 0) {
                b[k] = a[j];
                // System.out.print("B[" + k + "]= " + b[k] + "; ");
                k++;
            } else {
                c[l] = a[j];
                // System.out.print("C[" + l + "]= " + c[l] + "; ");
                l++;
            }
            
            
        }
        
        for (int m = 0; m < contPar; m++) {
            System.out.print("B[" + m + "]= " + b[m] + "; ");
            if(m==contPar-1) {
                System.out.println("\n");
            }
            
        }
        
        for (int n = 0; n < contImpar; n++) {
            System.out.print("C[" + n + "]= " + c[n] + "; ");
            if(n==contImpar-1) {
                System.out.println("");
            }
            
            
        }
        
       System.out.println("Pares: " + contPar + "\nÍmpares: " + contImpar); 
        
    }

}
