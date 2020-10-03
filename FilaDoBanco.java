import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FilaDoBanco {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int numeroDeCasos;
		int quantidadeDeSms;
		
		List<Integer> filaChegada = new ArrayList<>();
		List<Integer> filaReordenada = new ArrayList<>();
		
		String mensagensSms;
		
		numeroDeCasos = scr.nextInt();
		scr.nextLine();
		
		for (int i = 0; i < numeroDeCasos; i++) {
			
			quantidadeDeSms = scr.nextInt();
			scr.nextLine();
			
			mensagensSms = scr.nextLine();
			
			String[] numeros = mensagensSms.split(" ");
			
			for (int j = 0; j < numeros.length; j++) {
				filaChegada.add(Integer.parseInt(numeros[j]));
			}
			
			filaReordenada.addAll(filaChegada);
			
			filaReordenada.sort(Collections.reverseOrder());
			
			int numeroDeNaoMudancas = 0;
			
			for (int j = 0; j < quantidadeDeSms; j++) {
				if(filaChegada.get(j) == filaReordenada.get(j)) {
					numeroDeNaoMudancas++;
				}
			}
			
			System.out.println(numeroDeNaoMudancas);
			
			filaChegada.clear();
			filaReordenada.clear();
		}
				
		scr.close();
		
	}

}
