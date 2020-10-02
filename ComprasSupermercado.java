import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ComprasSupermercado {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		String produtos;
//		Set<String> set = new TreeSet<>((p1, p2) -> p2.compareTo(p1));
		List<List<String>> listaProdutos = new ArrayList<>() {
			@Override
			public String toString() {
				StringBuilder stb = new StringBuilder();
				for (int i = 0; i < this.size(); i++) {
					stb.append(this.get(i) + " ");
				}
				
				return stb.toString();
			}
		};
		
		Set<String> set = new TreeSet<>();
		
		int N = scr.nextInt();
		
//		while (N > 99) {
//			N = scr.nextInt();
//		}
		
		scr.nextLine();
		
		for (int i = 0; i <N; i++) {
			
			produtos = scr.nextLine();
			String[] produto = produtos.split(" ");
			
			for (int j = 0; j < produto.length; j++) {
				set.add(produto[j].toLowerCase());
			}

			List<String> listaP = new ArrayList<>() {
				@Override
				public String toString() {
					StringBuilder stb = new StringBuilder();
					for (int i = 0; i < this.size(); i++) {
						stb.append(this.get(i) + " ");
					}
					
					return stb.toString();
				}
			};
			
			Iterator<String> iterator = set.iterator();
			while (iterator.hasNext()) {
				listaP.add(iterator.next());
			}
			
			listaProdutos.add(listaP);
			
			set.clear();
		}
		
		listaProdutos.forEach(System.out::println);
		
		
		
		scr.close();
	}

}
