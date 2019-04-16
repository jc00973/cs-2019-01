package ex3;

public class ex5 {
	
	public static int soma(int n) {
		
		int i = 2;
		int s = 1;
		
		while(i<=n) {
			s = s + i;
			i = i + 1;
		}
		
		return s;
	}

	public static void main(String args[]) {
		System.out.println(soma(4));
	}
}
