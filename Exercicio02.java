package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,nota3,nota4,mediaFinal;
		
		System.out.println("Digite a sua primeiro nota:");
		nota1 = sc.nextDouble();
		System.out.println("Digite a sua segunda nota:");
		nota2 = sc.nextDouble();
		System.out.println("Digite a sua terceira nota:");
		nota3 = sc.nextDouble();
		System.out.println("Digite a sua quarta nota:");
		nota4 = sc.nextDouble();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Media final:"+mediaFinal);
	}

}
