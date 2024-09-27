package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//vetor com os numeros de led de cada indice
		int[] vetor = {6,2,5,5,4,5,6,3,7,6};
		
		int numeroCasos = sc.nextInt();
		
		for(int i = 0 ; i < numeroCasos ; i++) {
			
			int numeroLed = sc.nextInt();
			char[] digitos = String.valueOf(numeroLed).toCharArray();
			
			int soma = 0 ;
			for ( char d : digitos ) {
				
				String s = Character.toString(d);
				int a = Integer.parseInt(s);
				soma += vetor[a];
				}
			
			System.out.printf("%s leds%n",soma);
		}
		
		
		sc.close();
		

	}

}
