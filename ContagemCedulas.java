import java.util.Scanner;

public class ContagemCedulas {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int valor = scr.nextInt();
		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;
		int nota1 = 0;
		int valorFaltando = 0;
		
		nota100 = (int) valor / 100;
		valorFaltando = valor % 100;
		
		nota50 = (int) valorFaltando / 50;
		valorFaltando %= 50; 
		
		nota20 = (int) valorFaltando / 20;
		valorFaltando %= 20;
		
		nota10 = (int) valorFaltando / 10;
		valorFaltando %= 10;
		
		nota5 = (int) valorFaltando / 5;
		valorFaltando %= 5;
		
		nota2 = (int) valorFaltando / 2;
		valorFaltando %= 2;
		
		nota1 = (int) valorFaltando;
		
		System.out.println(valor);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		
		
		scr.close();
	}

}
