package beecrowdExercicio1013;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maior;
		
		if(num1 >= num2 && num1 >= num3 ) {
			maior = num1 ;
		}
		else if(num2 >= num3){
			maior = num2;
		}
		else {
			maior = num3;
		}
		
		System.out.printf("%s eh o maior",maior);
	}

}
