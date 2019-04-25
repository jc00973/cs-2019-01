package com.github.jc00973.cs.aula1;

public class ex19 {
	
	public static int fibonacci(int n) {
		
		int a = 0;
		int c = 1;
		
		if((n==0)||(n==1)) return n;
		
		int i = 2;
		
		while (i<=n) {
			int t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}
		
		return c;
	}

	public static void main(String args[]) {
		System.out.println(fibonacci(10));
	}
}
