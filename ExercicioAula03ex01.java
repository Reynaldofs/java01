package aula01;

import java.util.Scanner;

public class ExercicioAula03ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		
		 int n1,n2;
		 
		 System.out.println("Digite o primeiro número:");
		 n1 = sc.nextInt();
		 
		 System.out.println("Digite o segundo número:");
		 n2 = sc.nextInt();
		 
		 if(n1 >= n2) {
				System.out.println("Intevalo invalido: ");
				System.exit(0);
			}
			System.out.println("No intervalo entre " + n1 + " e " + n2 + ":");
			
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
