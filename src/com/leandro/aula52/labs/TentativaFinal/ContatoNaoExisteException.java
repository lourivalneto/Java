/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leandro.aula52.labs.TentativaFinal;

/**
 *
 * @author leandro
 */
public class ContatoNaoExisteException extends Exception {

    @Override
    public String getMessage() {
        return "Erro: contato não existe.";
    }
    
}
