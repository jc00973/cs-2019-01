package ex3;

public class ex18 {
	
	public static double horner(int x, int g, int a[]) {
		
		double p = a[g];
		int i = g - 1;
		
		while(0<=i) {
			p = p * x + a[i];
			i = i - 1;
		}
		
		return p;
	}
}
