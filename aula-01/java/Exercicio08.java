package com.github.jc00973.cs.aula1.java;

public class Exercicio08 {

	public static int produto(int a, int b) {

		int totalParcelas = a;
		int parcela = b;

		if (b < a) {
			totalParcelas = b;
			parcela = a;
		}

		int i = 1;
		int s = 0;

		while (i <= totalParcelas) {
			s = s + parcela;
			i = i + 1;
		}

		return s;
	}

	public static int potencia(int x, int y) {

		int potencia = 1;
		int i = 1;

		while (i <= y) {
			potencia = produto(potencia, x);
			i = i + 1;
		}

		return potencia;
	}
}
