package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int x = sc.nextInt();
		
		for(int i = x ; i> 0 ; i--) {
			int y = sc.nextInt();
			chamadas = 0; 
			int resultado = fib(y);
			System.out.println(String.format("fib(%s) = %s calls = %s",y ,chamadas-1 , resultado ));
			
		}
	}
	
		
	static int chamadas = 0 ;
	public static int fib(int n ) {
		if(n == 0) {
			chamadas++;
			return 0;
		}
		if(n == 1) {
			chamadas++;
			return 1;
		}
		
		else {
			chamadas++;
			return (fib(n-1) + fib(n-2));
		}
		
	}

}
