package com.leandro.aula19.labs;
import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros para ver suas respectivas tabuadas.");
        for(int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
            for (int j = 1; j <= 10; j++) {
                int produto = a[i] * j;
                System.out.println(a[i] + " x " + j + " = " + produto);
            }
        }
        
    }
    
}
