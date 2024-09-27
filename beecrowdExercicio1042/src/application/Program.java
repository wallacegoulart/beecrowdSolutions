package application;

import java.util.Arrays;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[3];
		vetor[0] = sc.nextInt();
		vetor[1] = sc.nextInt();
		vetor[2] = sc.nextInt();
		
		int[] vetor2 = new int[3];
		vetor2[0] = vetor[0];
		vetor2[1] = vetor[1];
		vetor2[2] = vetor[2];	
		
				
		Arrays.sort(vetor);
		
		for(int i : vetor) 
		{
			System.out.println(i);	
		}
		System.out.println();
		for(int i : vetor2) 
		{
			System.out.println(i);	
		}
	}

}
