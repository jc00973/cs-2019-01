package com.github.jc00973.cs.aula1.java;

public class Exercicio17 {

	public static double mdc2(int a, int b) {

		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}

		return a;
	}
}
