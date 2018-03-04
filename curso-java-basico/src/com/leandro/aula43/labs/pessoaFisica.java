package com.leandro.aula43.labs;

public class pessoaFisica extends Contribuintes {
	private final double AL_RB_0_A_1400 = 0;
	private final double AL_RB_1400_01_A_2100 = 10/100;
	private final double AL_RB_2100_01_A_2800 = 15/100;
	private final double AL_RB_2800_01_A_3600 = 25/100;
	private final double AL_RB_3600_01_PRA_MAIS = 30/100;

	private final double PARCELA_DEDUCAO_0_A_1400 = 0;
	private final double PARCELA_DEDUCAO_1400_01_A_2100 = 100;
	private final double PARCELA_DEDUCAO_2100_01_A_2800 = 270;
	private final double PARCELA_DEDUCAO_2800_01_A_3600 = 500;
	private final double PARCELA_DEDUCAO_3600_01_PRA_MAIS = 700;

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
		if (this.getRenda() > 0 && this.getRenda() <= 1400) {
			return this.getRenda() * this.getAL_RB_0_A_1400() - this.getPARCELA_DEDUCAO_0_A_1400();
		} else if (this.getRenda() >= 1400.01 && this.getRenda() <= 2100) {
			return this.getRenda() * this.getAL_RB_1400_01_A_2100() - this.getPARCELA_DEDUCAO_1400_01_A_2100();
		} else if (this.getRenda() >= 2100.01 && this.getRenda() <= 2800) {
			return this.getRenda() * this.getAL_RB_2100_01_A_2800() - this.getPARCELA_DEDUCAO_2100_01_A_2800();
		} else if (this.getRenda() >= 2800.01 && this.getRenda() <= 3600) {
			return this.getRenda() * this.getAL_RB_2800_01_A_3600() - this.getPARCELA_DEDUCAO_2800_01_A_3600();
		} else if (this.getRenda() >= 3600.01) {
			return this.getRenda() * this.getAL_RB_3600_01_PRA_MAIS() - this.getPARCELA_DEDUCAO_3600_01_PRA_MAIS();
		}
		return this.getRenda();
	}

	@Override
	public String toString() {
		return "Imposto de Renda para Pessoa Física\nRenda Bruta\tAlíquota\tParcela a deduzir" + "\n0 a 1400\t10%\tR$0"
				+ "\nR$1400,01 a R$2100\t10%\tR$100" + "\nR$2100,01 a R$2800\t15%\tR$270,00"
				+ "\nR$2800,01 a R$3600\t25%\tR$500,00" + "\nR$3600,01 ou mais\t30%\tR$700,00";
	}

}
