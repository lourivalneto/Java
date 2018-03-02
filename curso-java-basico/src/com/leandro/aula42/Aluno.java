//teste..
package com.leandro.aula42;

public class Aluno {
    
    private String curso;
    private double[] notas;
    
    public Aluno(){
        super();
    }
    
    
    

    public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
		
	}




	public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.setNotas(notas);
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }

    public void metodoQualquer() {
    	//super.setCpf("343434343443");
    	
    	//this.setCpf("31325446465");
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        //s+= super.getEndereco();
        
        return s;
        //return endereco;
    }

    //@Override
    //public void imprimirEtiquetaEndereco() {
        //System.out.println(this.obterEtiquetaEndereco());
    //}
    
    
    
    
}
