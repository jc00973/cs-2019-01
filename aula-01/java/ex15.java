package ex3;

public class ex15 {
	
	public static void crivoEratostenes(int a[], int n) {
		
		int i = 2;
		double limite = Math.abs(Math.sqrt(n));
		
		while(i<=limite) {
			if(a[i]==0) {
				
				int multiplo = i + i;
				
				while(multiplo <= n) {
					a[multiplo] = 1;
					multiplo = multiplo + i;
				}
			}
			i = i + 1;
		}
	}

}
