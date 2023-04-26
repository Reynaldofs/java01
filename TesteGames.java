package aula01;

import java.time.LocalDate;

public class TesteGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2020, 9, 20); 
		
		Produto p1 = new Produto (568, "League of legendes", 8,85, data);
		
		Produto p2 = new Produto (768, "Dota2", 8,95, data);
				LocalDate data2 = LocalDate.of(2013, 12, 3);
		
		p1.setDataLancamento(data2);
		p2.setDataLancamento(data2);
		p1.visualizar();
		p2.visualizar();
	}

}
