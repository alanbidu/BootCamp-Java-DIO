import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaNoAcampamento {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		List<String> listaAlunos = new ArrayList<>(); 
		
		int numeroDeAlunos;
		String alunoFicha;
		String aluno;
		String valorFicha;
		int valorAtualFicha;
		int indiceTransitorio;
		int indiceAtual;
		int indiceAlunoEliminado;
		
		numeroDeAlunos = scr.nextInt();
		scr.nextLine();
		
		while (numeroDeAlunos > 0) {
			for (int i = 0; i < numeroDeAlunos; i++) {
				alunoFicha = scr.nextLine();
				aluno = alunoFicha.split(" ")[0];
				valorFicha =  alunoFicha.split(" ")[1];
				
				listaAlunos.add(aluno.trim() + " " + valorFicha.trim());
			}
			
			
//			indiceTransitorio = 0;
			indiceAtual = 0;
			indiceAlunoEliminado = 0;
			valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAtual).split(" ")[1]);
			
			for (int i = 0; i < numeroDeAlunos - 1; i++) {

				if (i == 0 && valorAtualFicha % 2 == 0) {
					indiceTransitorio = valorAtualFicha % listaAlunos.size();
					indiceAlunoEliminado = (indiceAtual - indiceTransitorio) < 0 ? 
							(listaAlunos.size() - indiceTransitorio) : (indiceAtual - indiceTransitorio) ;
					valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).trim().split(" ")[1]);
					indiceAtual = indiceAlunoEliminado;
					listaAlunos.remove(indiceAlunoEliminado);
				} else if (i == 0){
					indiceTransitorio = valorAtualFicha % listaAlunos.size();
					indiceAlunoEliminado = (indiceTransitorio + indiceAtual) > listaAlunos.size() ? 
							((indiceAtual + indiceTransitorio) % listaAlunos.size()) : (indiceTransitorio + indiceAtual);
					indiceAtual = indiceAlunoEliminado;
					valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).trim().split(" ")[1]);
					listaAlunos.remove(indiceAlunoEliminado);
				}
				
				if (i != 0 && valorAtualFicha % 2 == 0) {
					indiceAlunoEliminado = listaAlunos.size() - (valorAtualFicha % listaAlunos.size()) - indiceAlunoEliminado;
					valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).trim().split(" ")[1]);
					listaAlunos.remove(indiceAlunoEliminado);
				}else if(i != 0) {
					
				}
				
			}
			
//			System.out.println(listaAlunos);
			System.out.println("Vencedor(a): " + listaAlunos.get(0).split(" ")[0]);
			
			numeroDeAlunos = scr.nextInt();
			scr.nextLine();
						
		}
				
		scr.close();
		
	}

}
