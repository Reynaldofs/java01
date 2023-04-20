package aula01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioAula05ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int contador = 0; contador < 10; contador ++) {
			System.out.println("Digite um número: ");
			numeros.add(sc.nextInt());
		}
		
		numeros.add(null);
		
		System.out.println("Listar os Elementos do Conjunto");
		
		for(var numero : numeros)
			System.out.println(numero);
		
		sc.close();
        
	}
	
	
	
}
