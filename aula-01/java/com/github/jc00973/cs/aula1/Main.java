package com.github.jc00973.cs.aula1;

public class Main {
	
	public static boolean propriedade153(int n){
		
		int c = n/100;
		int du = n%100;
		int d = du/10;
		int u = du%10;
		
		double x = Math.pow(c, 3);
		double y = Math.pow(d, 3);
		double z = Math.pow(u, 3);
		
		return (x+y+z) == n;
	}
	
	public static void main (String arg[]){
		
		propriedade153(153);
	}
}