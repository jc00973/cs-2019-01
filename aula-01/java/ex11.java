package ex11;

public class ex11 {
	
	public static double razaoAurea(int x, int y, int k){
		
		double c = y;
		double a = x;
		double i = 1;
		
		while(i <= k){
			double t = c;
			c = c + a;
			a = t;
			i = i + 1;
		}
		
		return c/a;
	}
	
	public static void main(String args[]){
		
		System.out.println(razaoAurea(1, 2, 50));
	}
}
