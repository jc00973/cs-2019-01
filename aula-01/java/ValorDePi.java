package com.github.jc00973.cs.aula1.java;

public class ValorDePi {

	public static double pi(int n) {
		double i = 1;
		double s = -1;
		double d = -1;
		double p = 0;

		while (i <= n) {
			d = d + 2;
			s = -1 * s;
			p = p + 4 * s / d;
			i = i + 1;
		}

		return p;
	}
}
