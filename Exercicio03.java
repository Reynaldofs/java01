package aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		
		float SaBru,AdiNotu,HorEX,Descontos,SalaLido;
		
		System.out.println("Digite o salario Bruto:");
		SaBru = sc.nextFloat();
		System.out.println("Adicional Noturno:");
		AdiNotu = sc.nextFloat();
		System.out.println("Horas Extras:");
		HorEX = sc.nextFloat();
		System.out.println("Descontos:");
		Descontos = sc.nextFloat();
		
		SalaLido = SaBru+AdiNotu+(HorEX * 5) -Descontos;
		
		System.out.println("Salario Liquido:" +SalaLido);
	}

}
