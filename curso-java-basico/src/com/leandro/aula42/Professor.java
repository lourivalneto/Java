
package com.leandro.aula42;

public class Professor {
    private double salario;
    private String nomeCurso;
    
    

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
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Professor: ";
        //s+= super.getEndereco();
        
        return s;
        //return endereco;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do Professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
    
}
