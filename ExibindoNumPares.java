import java.util.Scanner;

public class ExibindoNumPares {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		for (int i=2; i <= num; i+=2) {
			System.out.println(i);
		}
		
		scr.close();
	}

}
