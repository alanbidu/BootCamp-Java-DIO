import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidadorSenhasRequisitos {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		String senha;
		
		while (scr.hasNextLine()) {
			
			senha = scr.nextLine();
			
			Pattern padrao1 = Pattern.compile("[a-zA-Z0-9]+");
			Pattern padrao2 = Pattern.compile(".*[0-9].*");
			Pattern padrao3 = Pattern.compile(".*[a-z].*");
			Pattern padrao4 = Pattern.compile(".*[A-Z].*");
//			Matcher pesquisa = padrao1.matcher(senha);
			
			if (padrao1.matcher(senha).matches() && senha.length() > 5 && senha.length() < 33 &&
					padrao2.matcher(senha).matches() && padrao3.matcher(senha).matches() && padrao4.matcher(senha).matches()) {
					System.out.println("Senha valida.");
			} else {
				System.out.println("Senha invalida.");
			}
			
//			System.out.println(padrao1.matcher(senha).matches());
//			System.out.println(padrao2.matcher(senha).matches());
//			System.out.println(padrao3.matcher(senha).matches());
//			System.out.println(padrao4.matcher(senha).matches());
		}
		
		scr.close();
	}

}
