package appliaction;

import java.util.Arrays;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroCasos = sc.nextInt();
		sc.nextLine();
		
		//vetor com as possibilidades
		int[] vetor = {6,2,5,5,4,5,6,3,7,6};
		
		for(int cont = 0 ; cont < numeroCasos ; cont ++) {
			String numero = sc.nextLine();
			
			String[] numeroSeparado = numero.split("");
			int soma = 0 ;
			
			for(String x : numeroSeparado) {
				soma+=vetor[Integer.parseInt(x)];
			}
			
			System.out.printf("%s leds%n",soma);
		

			}
	}

}

