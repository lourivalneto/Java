package com.leandro.aula43.labs;

public class pessoaFisica extends Contribuintes {
	private final double AL_RB_0_A_1400 = 0;
	private final double AL_RB_1400_01_A_2100 = 0.1;
	private final double AL_RB_2100_01_A_2800 = 0.15;
	private final double AL_RB_2800_01_A_3600 = 0.25;
	private final double AL_RB_3600_01_PRA_MAIS = 0.3;

	private final double PARCELA_DEDUCAO_0_A_1400 = 0;
	private final double PARCELA_DEDUCAO_1400_01_A_2100 = 100;
	private final double PARCELA_DEDUCAO_2100_01_A_2800 = 270;
	private final double PARCELA_DEDUCAO_2800_01_A_3600 = 500;
	private final double PARCELA_DEDUCAO_3600_01_PRA_MAIS = 700;
	
	private double calculoFaixa1 = this.getRenda() * AL_RB_0_A_1400 - PARCELA_DEDUCAO_0_A_1400; // ISENTO
	private double calculoFaixa2 = this.getRenda() * AL_RB_1400_01_A_2100 - PARCELA_DEDUCAO_1400_01_A_2100;
	private double calculoFaixa3 = this.getRenda() * AL_RB_2100_01_A_2800 - PARCELA_DEDUCAO_2100_01_A_2800;
	private double calculoFaixa4 = this.getRenda() * AL_RB_2800_01_A_3600 - PARCELA_DEDUCAO_2800_01_A_3600;
	private double calculoFaixa5 = this.getRenda() * AL_RB_3600_01_PRA_MAIS - PARCELA_DEDUCAO_3600_01_PRA_MAIS;

	public double getCalculoFaixa1() {
		return calculoFaixa1;
	}

	public void setCalculoFaixa1(double calculoFaixa1) {
		this.calculoFaixa1 = calculoFaixa1;
	}

	public double getCalculoFaixa2() {
		return calculoFaixa2;
	}

	public void setCalculoFaixa2(double calculoFaixa2) {
		this.calculoFaixa2 = calculoFaixa2;
	}

	public double getCalculoFaixa3() {
		return calculoFaixa3;
	}

	public void setCalculoFaixa3(double calculoFaixa3) {
		this.calculoFaixa3 = calculoFaixa3;
	}

	public double getCalculoFaixa4() {
		return calculoFaixa4;
	}

	public void setCalculoFaixa4(double calculoFaixa4) {
		this.calculoFaixa4 = calculoFaixa4;
	}

	public double getCalculoFaixa5() {
		return calculoFaixa5;
	}

	public void setCalculoFaixa5(double calculoFaixa5) {
		this.calculoFaixa5 = calculoFaixa5;
	}

	public double getAL_RB_0_A_1400() {
		return AL_RB_0_A_1400;
	}

	public double getAL_RB_1400_01_A_2100() {
		return AL_RB_1400_01_A_2100;
	}

	public double getAL_RB_2100_01_A_2800() {
		return AL_RB_2100_01_A_2800;
	}

	public double getAL_RB_2800_01_A_3600() {
		return AL_RB_2800_01_A_3600;
	}

	public double getAL_RB_3600_01_PRA_MAIS() {
		return AL_RB_3600_01_PRA_MAIS;
	}

	public double getPARCELA_DEDUCAO_0_A_1400() {
		return PARCELA_DEDUCAO_0_A_1400;
	}

	public double getPARCELA_DEDUCAO_1400_01_A_2100() {
		return PARCELA_DEDUCAO_1400_01_A_2100;
	}

	public double getPARCELA_DEDUCAO_2100_01_A_2800() {
		return PARCELA_DEDUCAO_2100_01_A_2800;
	}

	public double getPARCELA_DEDUCAO_2800_01_A_3600() {
		return PARCELA_DEDUCAO_2800_01_A_3600;
	}

	public double getPARCELA_DEDUCAO_3600_01_PRA_MAIS() {
		return PARCELA_DEDUCAO_3600_01_PRA_MAIS;
	}

	public double calcularIR() {
		if (this.getRenda() > 0 && this.getRenda() <= 1400 && this.getRenda() > 0) {
			return this.getRenda() * this.getAL_RB_0_A_1400() - this.getPARCELA_DEDUCAO_0_A_1400();
		} else if (this.getRenda() >= 1400.01 && this.getRenda() <= 2100 && this.getRenda() > 0) {
			return this.getRenda() * this.getAL_RB_1400_01_A_2100() - this.getPARCELA_DEDUCAO_1400_01_A_2100();
		} else if (this.getRenda() >= 2100.01 && this.getRenda() <= 2800 && this.getRenda() > 0) {
			return this.getRenda() * this.getAL_RB_2100_01_A_2800() - this.getPARCELA_DEDUCAO_2100_01_A_2800();
		} else if (this.getRenda() >= 2800.01 && this.getRenda() <= 3600 && this.getRenda() > 0) {
			return this.getRenda() * this.getAL_RB_2800_01_A_3600() - this.getPARCELA_DEDUCAO_2800_01_A_3600();
		} else if (this.getRenda() >= 3600.01 && this.getRenda() > 0) {
			return this.getRenda() * this.getAL_RB_3600_01_PRA_MAIS() - this.getPARCELA_DEDUCAO_3600_01_PRA_MAIS();
		}
		System.out.println("Renda menor ou igual a zero.");
		return this.getRenda();
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nIR: " + this.calcularIR();
	}

}
