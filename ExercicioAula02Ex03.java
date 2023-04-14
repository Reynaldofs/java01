package aula01;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioAula02Ex03 {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario,novoSalario;
		
		System.out.println("REAJUSTE DE SALÁRIOS\n");
		System.out.println("Código\tCargo\tPercentual do Reajuste");
		System.out.println("1\tGerente\t\t10%");
		System.out.println("2\tVendedor\t7%");
		System.out.println("3\tSupervisor\t9%");
		System.out.println("4\tMotorista\t6%");
		System.out.println("5\tEstoquista\t5%");
		System.out.println("6\tTécnico de TI\t8%\n\n");
	
	System.out.println("Digite o seu nome: ");
	nome = sc.nextLine();
	
	System.out.println("Digite o código do seu cargo: ");
	codigo = sc.nextInt();
	
	System.out.println("Digite o seu salario atual:");
	salario = sc.nextFloat();
	
	
	switch(codigo) {
	case 1:
		novoSalario = salario*1.1f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	case 2:
		novoSalario = salario * 1.07f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	case 3:
		novoSalario = salario * 1.09f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	case 4:
		novoSalario = salario * 1.06f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	case 5:
		novoSalario = salario * 1.05f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	case 6:
		novoSalario = salario * 1.08f;
		System.out.println("\n" + nome + ", seu novo salário é: " + nf.format(novoSalario));
		break;
	default:
		System.out.println("Código inválido!");


	}

}	
}


