import java.util.Scanner;

public class PedraPapelTesouraEtc {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		int casosDeTeste = scr.nextInt();
		scr.nextLine();
		
		for(int i = 0; i < casosDeTeste; i++) {
			
			turno(scr.next(), scr.next());
			
		}
		
		scr.close();
	}

	
	
	private static void turno(String fer, String mar) {
		
		if (fer.equals(Jogadas.PEDRA.getDescricao())) {
			if (mar.equals(Jogadas.PEDRA.getDescricao())) {
				System.out.println("empate");
			} else if (mar.equals(Jogadas.PAPEL.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.TESOURA.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.LAGARTO.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.SPOCK.getDescricao()) ) {
				System.out.println("marcia");
			}
		}
		
		
		if (fer.equals(Jogadas.PAPEL.getDescricao())) {
			if (mar.equals(Jogadas.PEDRA.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.PAPEL.getDescricao())) {
				System.out.println("empate");
			} else if (mar.equals(Jogadas.TESOURA.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.LAGARTO.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.SPOCK.getDescricao()) ) {
				System.out.println("fernanda");
			}
		}
		
		if (fer.equals(Jogadas.TESOURA.getDescricao())) {
			if (mar.equals(Jogadas.PEDRA.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.PAPEL.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.TESOURA.getDescricao())) {
				System.out.println("empate");
			} else if (mar.equals(Jogadas.LAGARTO.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.SPOCK.getDescricao()) ) {
				System.out.println("marcia");
			}
		}
		
		if (fer.equals(Jogadas.LAGARTO.getDescricao())) {
			if (mar.equals(Jogadas.PEDRA.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.PAPEL.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.TESOURA.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.LAGARTO.getDescricao())) {
				System.out.println("empate");
			} else if (mar.equals(Jogadas.SPOCK.getDescricao()) ) {
				System.out.println("fernanda");
			}
		}
		
		if (fer.equals(Jogadas.SPOCK.getDescricao())) {
			if (mar.equals(Jogadas.PEDRA.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.PAPEL.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.TESOURA.getDescricao())) {
				System.out.println("fernanda");
			} else if (mar.equals(Jogadas.LAGARTO.getDescricao())) {
				System.out.println("marcia");
			} else if (mar.equals(Jogadas.SPOCK.getDescricao()) ) {
				System.out.println("empate");
			}
		}
		
		
	}



	public enum Jogadas {
		PEDRA("pedra"),
		PAPEL("papel"),
		TESOURA("tesoura"),
		LAGARTO("lagarto"),
		SPOCK("spock");
		
		private String descricao;
		
		Jogadas(String descricao) {
			this.descricao = descricao;
		}
		
		public String getDescricao() {
			return this.descricao;
		}
	}
}
