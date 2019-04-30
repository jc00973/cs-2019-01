package com.github.jc00973.cs.aula1.java;

public class Exercicio04 {

	public static int mod(int x, int y) {

		int s = x;

		while (s >= y) {
			s = s - y;
		}

		return s;
	}
}
