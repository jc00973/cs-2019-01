package com.github.jc00973.cs.aula1;

public class ex17 {
	
	public static double mdc2(int a, int b) {
		
		while(a!=b) {
			if(a>b) a = a - b;
			else b = b - a;
		}
		
		return a;
	}
	
	public static void main(String args[]) {
		System.out.println(mdc2(10, 5));
	}
}
