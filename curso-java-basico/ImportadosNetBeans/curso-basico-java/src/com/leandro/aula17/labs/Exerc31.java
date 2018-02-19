package com.leandro.aula17.labs;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o salário inicial.");
        double salarioInicial = scan.nextDouble();
        double aumentoInicial = 1.5;
        
        double salarioInicial1996 = salarioInicial/100 * aumentoInicial + salarioInicial;
        double salarioAnterior = salarioInicial1996;
        double salarioAtual = 0;
        
        double aumentoAnterior = aumentoInicial;
        double dobraAumentoAnterior = 0;
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        for (int i=1997; i<=2017; i++) {
            dobraAumentoAnterior = aumentoAnterior * 2; // 1.5*2=3 // 3*2=6 //
            salarioAtual = (salarioAnterior/100 * dobraAumentoAnterior) + salarioAnterior; 
            /* 1015/100*3+1015=1045,45 */ /* 1045,45/100*6+1045,45=1108,177 */
            salarioAnterior = salarioAtual; // 1045,45 // 1108,177
            
            aumentoAnterior = dobraAumentoAnterior; // =3 // 6 //
            
            System.out.println(i + " = R$" + format.format(salarioAtual) + " - " + dobraAumentoAnterior + "%");
            
        }
        
        
    }
    
}
