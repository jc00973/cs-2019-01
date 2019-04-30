package com.github.jc00973.cs.aula1.java;

public class Exercicio14 {

	public static boolean primo(int n) {

		double i = 2;

		while (i < n) {
			if (n % i == 0) {
				return false;
			}

			i = i + 1;
		}

		return true;
	}
}
