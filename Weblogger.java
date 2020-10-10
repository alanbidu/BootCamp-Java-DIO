import java.util.Scanner;

public class Weblogger {

	public static void main(String[] args) {
		
//		Locale.setDefault(new Locale("pt", "BR"));
		
		Scanner scr = new Scanner(System.in);
		
		boolean linha = false;
		boolean estrela = false;
		
		while (scr.hasNextLine()) {
		
			String frase = scr.nextLine();
			
			
			while(frase.contains("_") || frase.contains("*") ) {
			
				if (frase.contains("_") && !linha) {
					frase = frase.replaceFirst("_", "<i>");
					linha = true;
				} else if (frase.contains("_")) {
					frase = frase.replaceFirst("_", "</i>");
					linha = false;
				}
				
				if (frase.contains("*") && !estrela) {
					frase = frase.replaceFirst("\\*", "<b>");
					estrela = true;
				} else if (frase.contains("*")) {
					frase = frase.replaceFirst("\\*", "</b>");
					estrela = false;
				}
				
			}
			
			System.out.println(frase);
		}
		
		
		scr.close();
	}

}
