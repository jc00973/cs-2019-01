package ex3;

public class ex9 {
	
	public static double pi(int n) {
		double i = 1;
		double s = -1;
		double d = -1;
		double p = 0;
		
		while(i<=n) {
			d = d + 2;
			s = -1 * s;
			p = p + 4 * s / d;
			i = i + 1;
		}
		
		return p;
	}
	
	public static void main(String args[]) {
		System.out.println(pi(100000000));
	}
}
