
package com.leandro.aula39;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;
    
    public void verificarAcesso(){
        this.setNomeVisibilidade("dfadsfadfs");
        super.setNomeVisibilidade("dfasdfasdf");
        super.nomeVisibilidade = "";
        this.nomeVisibilidade = "";
    }

    /**teste
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
    
}
