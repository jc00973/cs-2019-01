package ex3;

public class ex16 {
	
	public static double mdc(double a, double b) {
		
		while(b!=0) {
			double m = a%b;
			a = b;
			b = m;
		}
		
		return a;
	}
	
	public static void main(String args[]) {
		System.out.println(mdc(10, 5));
	}

}
