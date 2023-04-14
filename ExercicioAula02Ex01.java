package aula01;

import java.util.Scanner;

public class ExercicioAula02Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c, soma;
		
		System.out.println("Digite seu primeiro número:");
		a = sc.nextInt();
		System.out.println("Digite seu segundo número:");
		b = sc.nextInt();
		System.out.println("Digite seu terceiro número:");
		c = sc.nextInt();
		
		soma = a + b; 
		if(soma > c)		
			System.out.println("A Soma de A + B é Maior do que C");
		else if (soma < c)
			System.out.println("A Soma de A + B é Menor do que C");
		else if (soma >= c)
			System.out.println("A Soma de A + B é Igual a C");
	}

}
