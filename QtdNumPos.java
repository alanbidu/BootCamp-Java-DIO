import java.util.Locale;
import java.util.Scanner;

public class QtdNumPos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scr = new Scanner(System.in);
		double[] nums = new double[6];
		int qtdPos = 0;
		
		for (short i = 0; i < 6 ;i++ ) {
			nums[i] = scr.nextDouble();
			if (nums[i] > 0) qtdPos++;
		}
		
		System.out.println(qtdPos + " valores positivos");
		
		scr.close();
	}

}
