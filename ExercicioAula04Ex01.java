package aula01;

import java.util.Scanner;

public class ExercicioAula04Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int[]vetorinte = {2,5,1,3,4,9,7,8,10,6};
		
		int posicao = -1;
		
		System.out.println("Digite o número que vocé deseja encontrar:");
		int procura = sc.nextInt();
		
		for (int indice = 0; indice < vetorinte.length; indice++) {
			if(vetorinte [indice] == procura ) {
				posicao = indice;
			}
		
		}
		
		 if (posicao == -1){
	            System.out.printf("O número %d não foi encontrado!", procura );
	        } else {
	        	 System.out.printf("O número %d está localizado na posição: %d", procura, posicao);
	        }

	        sc.close();
	}
}
