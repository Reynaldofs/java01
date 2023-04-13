package aula01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float n1,n2,n3,n4,Diferenca;
	
		
		
		System.out.println("Digite o primeiro valor:");
		n1 = leia.nextFloat ();
		
		System.out.println("Digite o segundo valor:");
		n2 = leia.nextFloat ();
		
		System.out.println("Digite o terceiro valor:");
		n3 = leia.nextFloat ();
		
		System.out.println("Digite o quarto valor");
		n4 = leia.nextFloat ();
		
		Diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Salario Liquido:" + Diferenca);
		
		leia.close();
	}

}
