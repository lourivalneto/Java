/*
// gera números aleatórios de 1 à 100.
int random = 1 + (int) (Math.random() * 100);

*/

package com.leandro.aula19.labs;
//import java.util.Random;

public class Exer22 {

	public static void main(String[] args) {
            int[] A = new int[10];
            int cont0 = 0;
            int cont1 = 0;
            int percent0 = 0;
            int percent1 = 0;
            //Random gerador = new Random();
            
	    for (int i = 0; i < 10; i++) {
	    	//System.out.println(gerador.nextInt(2));
                //A[i] = (gerador.nextInt(2));
                System.out.println((int)(Math.round(Math.random() * 1)));
                A[i] = (int)(Math.round(Math.random() * 1));
                
                if(A[i]==0) {
                    cont0++;
                } else {
                    cont1++;
                }
            }
            percent0 = cont0*100 /10;
            percent1 = cont1*100/10;
            System.out.println(percent0 + "% de Zeros gerados aleatoriamente.");
            System.out.println(percent1 + "% de Um gerados aleatoriamente.");
	}
}