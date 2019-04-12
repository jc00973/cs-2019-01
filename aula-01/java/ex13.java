package ex13;

public class ex13 {
	
	public static double raiz(double n, double i){
		
		double r = 1;
		
		while (0<=i){
			
			r = (r+n/r)/2;
			i = i - 1;
		}
		
		return r;
	}
	
	public static void main(String args[]){
		System.out.println(raiz(6,20));
	}
}
