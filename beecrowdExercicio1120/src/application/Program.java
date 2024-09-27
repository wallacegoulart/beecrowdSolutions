package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num1;
		String num2;
		char zero = '0';
		do {
			 num1 = sc.nextLine();
			 num2 = sc.nextLine();
			 System.out.println(num1);
			 System.out.println(num2);
			
		}while(num1 !=  Character.toString(zero) && num2 != Character.toString(zero) );
		
		
		sc.close();
	}

}

