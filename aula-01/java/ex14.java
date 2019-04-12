package ex14;

public class ex14 {
	
	public static boolean primo(int n){
		
		double i = 2;
		
		while(i<n){
			
			if(n%i==0){
				return false;
			}
			
			i = i+1;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		System.out.println(primo(234));
	}
}
