import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumParImpar {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int num;
		int N = scr.nextInt();
		
		while (1 > N && N > 105) {
			N = scr.nextInt();
		}
		
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		
		for (int i = 0; i < N; i++) {
			num = scr.nextInt();
			
			if (num % 2 == 0) {
				par.add(num);
			} else {
				impar.add(num);
			}
		}

		Collections.sort(par, (p1, p2) -> p1.compareTo(p2));
		Collections.sort(impar, (p1, p2) -> p2.compareTo(p1));
		
		//Collections.sort(impar, (p1, p2) -> p1.compareTo(p2));
		
		
		par.forEach(System.out::println);
		impar.forEach(System.out::println);
		
		scr.close();
	}

}
