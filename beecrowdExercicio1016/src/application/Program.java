package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en","US"));
		
		Scanner sc = new Scanner(System.in); 
		
		int num1 = sc.nextInt();
		
		System.out.printf("%s minutos%n", (num1*2) );
	}

}
