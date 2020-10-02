import java.util.Scanner;

public class ConsumoMedAuto {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int km = scr.nextInt();
		double combustivel = scr.nextDouble();
		
		double resultado = (double) km / combustivel;
		
		System.out.printf("%.3f km/l", resultado);
		
		scr.close();
	}

}
