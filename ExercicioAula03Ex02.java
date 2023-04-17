package aula01;

import java.util.Scanner;

public class ExercicioAula03Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade,menores = 0,maiores = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			
			System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		if(idade <=21)
			menores ++;
		
		if(idade >=50)
		maiores ++; 
		
		System.out.println("\nDeseja continuar? (S/N)");
        continua = leia.next().toUpperCase().charAt(0);
		
		}	
		System.out.println("Total de pessoas com idade menor que 21 anos: " + menores);
        System.out.println("Total de pessoas com idade maior que 50 anos: " +maiores);
		
		
	
		
		
		
	}

}
