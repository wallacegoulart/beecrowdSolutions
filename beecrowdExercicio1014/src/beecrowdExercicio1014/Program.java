package beecrowdExercicio1014;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		float combs = sc.nextFloat();
		
		float result = km/combs;
		System.out.printf("%.3f km/l%n", result);

	}

}
