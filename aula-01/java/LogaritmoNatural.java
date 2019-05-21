package com.github.jc00973.cs.aula1.java;

public class LogaritmoNatural {

	public static float logaritmoNatural(int n, int k) {

		float i = 2;
		float e = 1 + n;
		float numerador = n;
		float denominador = 1;

		while (i <= k) {
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + numerador / denominador;
			i = i + 1;
		}

		return e;

	}
}
