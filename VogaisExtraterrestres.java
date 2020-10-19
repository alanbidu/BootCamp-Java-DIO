import java.util.Scanner;

public class VogaisExtraterrestres {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		String vogal;
		String frase;
		
		while (scr.hasNext()) {
			vogal = scr.nextLine();
			frase = scr.nextLine();
			int qtd = 0;
			String[] vogais = vogal.trim().split("");
			
			for (int j = 0; j < vogais.length; j++) {
				for (int z = 0; z < frase.length(); z++) {
					if (vogais[j].equals(String.valueOf(frase.charAt(z)))) {
						qtd++;
					}
				}
			}
			
			System.out.println(qtd);
		}
		
		scr.close();
	}

}
