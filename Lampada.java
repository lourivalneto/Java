package com.leandro.aula27.labs;

public class Lampada {
    double tensão;
    double potencia;
    double dimensaoAltura;
    double dimensaoLargura;
    double diametroFuro;
    String cor;
    int vidaUtil;
    boolean estado;
    
    boolean ligarDesligar(boolean pedido){
        if(pedido){
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }
}
