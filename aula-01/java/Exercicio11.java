package com.github.jc00973.cs.aula1.java;

public class Exercicio11 {

	public static double razaoAurea(int x, int y, int k) {

		double c = y;
		double a = x;
		double i = 1;

		while (i <= k) {
			double t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}

		return c / a;
	}
}
