package beecrowdExercicio1015;

import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		
		Locale.setDefault(new Locale ("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		
		double resultado = Math.sqrt( Math.pow((x2-x1) ,2)  + Math.pow((y2-y1) ,2) );
		
		
		System.out.println(String.format("%.4f",resultado));
		
		sc.close();

	}

}
