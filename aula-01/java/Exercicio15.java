package com.github.jc00973.cs.aula1.java;

public class Exercicio15 {

	public static void crivoEratostenes(int a[], int n) {

		int i = 2;
		double limite = Math.floor(Math.sqrt(n));

		while (i <= limite) {
			if (a[i] == 0) {

				int multiplo = i + i;

				while (multiplo <= n) {
					a[multiplo] = 1;
					multiplo = multiplo + i;
				}
			}
			
			i = i + 1;
		}
	}

}
