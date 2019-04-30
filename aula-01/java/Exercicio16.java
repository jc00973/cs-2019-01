package com.github.jc00973.cs.aula1.java;

public class Exercicio16 {

	public static double mdc(double a, double b) {

		while (b != 0) {
			double m = a % b;
			a = b;
			b = m;
		}

		return a;
	}
}
