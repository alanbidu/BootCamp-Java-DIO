import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoPalavrasTamanho {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		List<String> palavras = new ArrayList<>();
		List<String> palavrasOrdenadas = new ArrayList<>();
		
		StringBuilder stb = new StringBuilder();
		int numeroDeConjuntos = scr.nextInt();
		scr.nextLine();

		
		
		for (int i = 0; i < numeroDeConjuntos; i++) {

			String[] palavra = scr.nextLine().split(" ");
			
			for(int j = 0; j < palavra.length; j++) {
				palavras.add(palavra[j]);
			}
						
			palavras.sort(new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if (o1.length() == o2.length()) {
						return o1.compareTo(o2);
					}
					return o2.length() - o1.length();
				}
			});
			
			palavras.forEach(s -> stb.append(s + " "));
			
			palavrasOrdenadas.add(stb.toString());
						
			palavras.clear();
			stb.delete(0, stb.length());
		}
		
		scr.close();

		palavrasOrdenadas.forEach(System.out::println);
		
		
	}

}
