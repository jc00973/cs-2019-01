package com.github.jc00973.cs.aula1.java;

public class Horner {

	public static double horner(int x, int g, int a[]) {

		double p = a[g];
		int i = g - 1;

		while (0 <= i) {
			p = p * x + a[i];
			i = i - 1;
		}

		return p;
	}
}
