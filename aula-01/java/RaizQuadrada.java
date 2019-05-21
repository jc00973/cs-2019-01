package com.github.jc00973.cs.aula1.java;

public class RaizQuadrada {

	public static double raiz(double n, double i) {

		double r = 1;

		while (0 <= i) {
			r = (r + n / r) / 2;
			i = i - 1;
		}

		return r;
	}
}
