import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UniformesFimAno {

	public static void main(String[] args) throws IOException {

		Scanner scr = new Scanner(System.in);

		List<String> saida = new ArrayList<>() {
			private static final long serialVersionUID = 1L;

			@Override
			public String toString() {
				StringBuilder stb = new StringBuilder();
				for (int i = 0; i < this.size(); i++) {
					stb.append(this.get(i));
				}
				return stb.toString();
			}
		};
		String nome;
		String corTamanho;
		String cor;
		String tamanho;

		int qtdAlunos = scr.nextInt();
		scr.nextLine();

		if (qtdAlunos < 1 || qtdAlunos > 60) {
			qtdAlunos = scr.nextInt();
			scr.nextLine();
		}

		while (qtdAlunos > 0) {

			for (int i = 0; i < qtdAlunos; i++) {
				nome = scr.nextLine();
				corTamanho = scr.nextLine();
				String[] corETamanho = corTamanho.split(" ");
				cor = corETamanho[0];
				tamanho = corETamanho[1];

				saida.add(cor.toLowerCase().trim() + " " + tamanho.toUpperCase().trim() + " " + nome.trim());
			}

			qtdAlunos = scr.nextInt();
			scr.nextLine();

//			if (qtdAlunos < 0 || qtdAlunos >60) {
//				qtdAlunos = scr.nextInt();
//				scr.nextLine();
//			}
		}

		scr.close();

		saida.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				String[] string1 = s1.split(" ");
				String cor1 = string1[0];
				String tamanho1 = string1[1];
				String nome1 = string1[2];

				String[] string2 = s2.split(" ");
				String cor2 = string2[0];
				String tamanho2 = string2[1];
				String nome2 = string2[2];

				if (cor1.equals(cor2)) {
					if (tamanho1.equals(tamanho2)) {
						return nome1.compareTo(nome2);
					}

					return tamanho2.compareTo(tamanho1);
				}

				return cor1.compareTo(cor2);
			}
		});

//		Collections.sort(saida, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				
//				String[] string1 = s1.split(" ");
//				String cor1 = string1[0];
//				String tamanho1 = string1[1];
//				String nome1 = string1[2];
//				
//				String[] string2 = s2.split(" ");
//				String cor2 = string2[0];
//				String tamanho2 = string2[1];
//				String nome2 = string2[2];
//				
//				if (cor1.equals(cor2)) {
//					if(tamanho1.equals(tamanho2)) {
//						return nome1.compareTo(nome2);
//					}
//					
//					return tamanho2.compareTo(tamanho1);
//				}
//				
//						
//				return cor1.compareTo(cor2);
//			}
//		});

		saida.forEach(System.out::println);

	}

}
