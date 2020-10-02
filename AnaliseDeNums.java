import java.util.Scanner;

public class AnaliseDeNums {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int[] nums = new int[5];
		short numPar = 0;
		short numImpar  = 0;
		short numPos = 0;
		short numNeg = 0;
				
		for (short i = 0; i < 5; i++) {
			nums[i] = scr.nextInt();
			
			if (nums[i] > 0) {
				numPos++;
			} else if (nums[i] < 0) {
				numNeg++;
			}
			
			if (nums[i] % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
		}
		
		System.out.println(numPar + " valor(es) par(es)");
		System.out.println(numImpar + " valor(es) impar(es)");
		System.out.println(numPos + " valor(es) positivo(s)");
		System.out.println(numNeg + " valor(es) negativo(s)");
		
		
		
		scr.close();
	}

}
