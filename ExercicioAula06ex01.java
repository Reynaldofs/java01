package aula01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioAula06ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>(); 
		
		String nome ="";
		
		do {
			System.out.println("*********************************");
			System.out.println(" 1- Adicionar Cliente na Fila");
			System.out.println(" 2- Lista todos os Clientes");
			System.out.println(" 3- Retirar Cliente da Fila");
			System.out.println(" 0- Sair");
			System.out.println("\n*********************************");
			System.out.println("Entre com a opção desejada:");
			op = leia.nextInt();
			leia.nextLine();
				
				switch(op) {
				case 1:
					System.out.println("Digite o nome do cliente:");
					
					nome = leia.nextLine();
					fila.add(nome);
					
					System.out.println("Cliente Adicionado!");
					break;
					
				case 2:
					System.out.println("Lista de Cliente na Fila");
					
					for(String cliente : fila)
						System.out.println(cliente);
					
					break;
					
	
				case 3:
					leia.nextLine();								
					if(fila.isEmpty()) {
						System.out.println("\nA fila esta vazia!");					
					}else {
						System.out.println("\nPróximo cliente: "+fila.poll());
					}
					break;
					
				
				
				  default:
					   if(op > 3);
					System.out.println("Opção invalida \\n");
					break;
				}	
					
					
				} while(op != 0);
				
			System.out.println("Programa finalizado! ");
		    leia.close();
			
			
			
			
			
		
		
		
		
		
}

}
