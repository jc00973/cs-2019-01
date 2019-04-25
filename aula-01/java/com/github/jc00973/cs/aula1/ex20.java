package com.github.jc00973.cs.aula1;

public class ex20 {
	
	public static boolean cpf(int d[]) {
		if (d == null || d.length != 11) {
			throw new IllegalArgumentException("cpf invalido");
		}

		for (int digito : d) {
			if (digito < 0 || digito > 9) {
				throw new IllegalArgumentException("cpf invalido");
			}
		}

		int j = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] + 8*d[8] + 9*d[9];
		int k = d[2] + 2*d[3] + 3*d[4] + 4*d[5] + 5*d[6] + 6*d[7] + 7*d[8] + 8*d[9] + 9*d[10];
		
		int dj = ((j%11)%10);
		int dk = ((k%11)%10);
		
		return ((dj==d[10])&&(dk==d[11]));
	}
	
	public static void main(String args[]) {
		int teste[] = {0, 0, 0, 1, 7, 5, 5, 0, 6, 2, 9, 9};
		System.out.println(cpf(teste));
	}

}
