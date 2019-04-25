package com.github.jc00973.cs.aula1;

public class Ex21 {
	
	public static boolean cpf2(int d[]) {
		
		int c = 8;
		int p = d[9];
		int s = d[9];
		
		while(1<=c) {
			p = p + d[c];
			s = s + p;
			c = c - 1;
		}
		
		int j = ((s%11)%10);
		int k = (((s-p+9*d[10])%11)%10);
		
		return (j==d[10])&&(k==d[11]);
	}
	
	public static void main(String args[]) {
		int teste[] = {0, 0, 0, 1, 7, 5, 5, 0, 6, 2, 9, 9};
		System.out.println(cpf2(teste));
	}

}
