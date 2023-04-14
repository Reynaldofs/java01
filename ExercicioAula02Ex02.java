package aula01;

import java.util.Scanner;

public class ExercicioAula02Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inteiro;
		
		System.out.println("Digite um numero:");
		inteiro = sc.nextInt();
		
		if(inteiro % 2 == 0) {
			 System.out.println("O número é par");	
		}else {
			System.out.println("O número é ímpar");
        }
		if (inteiro > 0) {
            System.out.println("O número é positivo");
        } else if (inteiro < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }
	}

}
