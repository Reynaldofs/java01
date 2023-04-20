package aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioAula05Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 ArrayList<String> cores = new ArrayList<String>();
		 String cor;
		 
		 
			 
			 for(int contador = 1; contador <=5; contador++) {
				 System.out.print("Digite uma cor: ");	           
	            cor = sc.nextLine();
	            cores.add(cor);

	        }
			 System.out.println("\nCores Adicionadas: ");
		        for ( var oCor: cores) 
		            System.out.println(oCor);

		       
		        System.out.println("Cores em Ordem:  ");
		        cores.sort(null);
		            for ( var oCor: cores) {
		            System.out.println(oCor);


		            sc.close();
			}
		
	}

}
