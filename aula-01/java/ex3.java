package ex3;

public class ex3 {
	
	public static double diaDaSemana(int d, int m, int a) {
		
		if((m==1)||(m==2)) {
			m = m + 12;
			a = a - 1;
		}
		
		int s = (d + 2*m + (3*(m+1))/5 + a + a/4 - a/100 + a/400);
		
		return s%7;
	}
	
	public static void main(String args[]) {
		System.out.println(diaDaSemana(21, 4, 2019));
	}
}
