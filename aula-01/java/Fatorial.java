package com.github.jc00973.cs.aula1.java;

public class Fatorial {
	
	public static int fatorial(int n) {
		
		int i = 2;
		int f = 1;
		
		while(i<=n) {
			f = f*i;
			i = i+1;
		}
		
		return f;
	}
}
