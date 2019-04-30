package com.github.jc00973.cs.aula1.java;

public class Exercicio12 {

	public static boolean quadradoPerfeito(int n) {

		int i = 1;
		int s = 1;

		while (s < n) {
			i = i + 2;
			s = s + i;
		}

		return (s == n);
	}
}
