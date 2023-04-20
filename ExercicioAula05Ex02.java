package aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioAula05Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final int quantiNumeros = 10;
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i < quantiNumeros; i++) {
            System.out.printf("Digite um numero para ser adicionado na %dª posicao da lista: ", i + 1);
            int addNumero = sc.nextInt();
            numeros.add(addNumero);
        }
		
		System.out.println();
        System.out.print("Digite o número que você deseja encontrar: ");
        int buscador = sc.nextInt();
		
        System.out.println();
        if (numeros.contains(buscador)) {
            System.out.printf("O número %d está localizado na posição: %d\n", buscador,numeros.indexOf(buscador));
            System.out.println();
        }
        System.out.printf("O número %d não foi encontrado!\n", buscador);
        System.out.println();

        sc.close();
	}

}
