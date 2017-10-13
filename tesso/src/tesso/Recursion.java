package tesso;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Abwerts1(10);
			System.out.println();
			Abwerts2(10);
		
		
		
		
	}
	static void Abwerts1(int n){
		if(n <= 0)
			return;
		System.out.print(n+",");
		Abwerts1(n-1);
	}
	static void Abwerts2(int n){
		if(n<=0)
			return;
		Abwerts2(n-1);
		System.out.print(n+",");
	}

}
