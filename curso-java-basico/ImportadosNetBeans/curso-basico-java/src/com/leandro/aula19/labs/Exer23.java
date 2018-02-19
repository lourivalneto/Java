package com.leandro.aula19.labs;

public class Exer23 {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 2;
        a[1] = 4;
        a[2] = 6;
        a[3] = 8;
        a[4] = 10;
        a[5] = 12;
        a[6] = 122;
        a[7] = 11;
        a[8] = 13;
        a[9] = 15;
        boolean para = false;

        for (int i = 0; i < 10; i++) {
            if(a[i]%2!=0) {
                para = true;
            }
            if(para) {
                break;
            }
            System.out.print(a[i] + " ");
        }
    }

}
