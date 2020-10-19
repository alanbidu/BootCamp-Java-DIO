import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContagemRepetidaNumeros {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		List<Integer> listaNumeros = new ArrayList<>();
		Map<Integer, Integer> mapaNumeros = new TreeMap<>();
		
		int numero;
		int qtd;
		int qtdNumeros = scr.nextInt();
		scr.nextLine();
		
		for (int i = 0; i < qtdNumeros; i++) {
			listaNumeros.add(scr.nextInt());
			scr.nextLine();
		}

//		System.out.println(listaNumeros);
		
		while (listaNumeros.size() > 0) {
			numero = listaNumeros.get(0);
			qtd = 0;
			for (int j = 0; j < listaNumeros.size(); j++) {
				if(listaNumeros.get(j) == numero) {
					qtd++;
					listaNumeros.remove(j);
//					System.out.println(listaNumeros);
					j--;
				}
			}
			
			mapaNumeros.put(numero, qtd);
		}
		
		while(mapaNumeros.size() > 0) {
			System.out.println(((TreeMap<Integer,Integer>) mapaNumeros).firstKey() + " aparece " + mapaNumeros.get(((TreeMap<Integer,Integer>) mapaNumeros).firstKey()) + " vez(es)");
			mapaNumeros.remove(((TreeMap<Integer,Integer>) mapaNumeros).firstKey());
		}
		
		scr.close();
	}

}
