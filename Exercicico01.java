package aula01;

import java.util.Scanner;

public class Exercicico01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o seu Salario:");
		salario = sc.nextFloat();
		
		System.out.println("Digite o Abono:");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salario: %.2f" , novoSalario);
		
		sc.close();
	}

}
