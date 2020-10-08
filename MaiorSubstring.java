import java.util.Scanner;

public class MaiorSubstring {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		String string1, string2;
		
			
		while (scr.hasNextLine()) {
			
			string1 = scr.nextLine();
			string2 = scr.nextLine();
			
			tamanhoMaiorSubstring(string1, string2);
			
		}
		
		scr.close();
	}

	
	
	private static void tamanhoMaiorSubstring(String s1, String s2) {
		
		int tamanhoMax = 0;
		
		if (s2.length() > s1.length()) {
			String s3 = s2;
			s2 = s1;
			s1 = s3;
		}
		
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < i + 1; j++) {
				if (s1.contains(s2.substring(j, s2.length() - i + j))) {
					tamanhoMax = (tamanhoMax > s2.length() - i) ? tamanhoMax : s2.length() - i ;
				}
			}
		}

		System.out.println(tamanhoMax);
	}
}





