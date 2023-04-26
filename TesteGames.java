package aula01;

import java.time.LocalDate;

public class TesteGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2020, 9, 20); 
		
		Produto[] Produto = new Produto[4];
		
		Produto [0] = new Jogo (568, "League of legendes", 8,85, data,"Xbox360");
		Produto [1] = new Jogo (568, "Valorant", 8,15, data,"Xbox360");
		Produto [2] = new Console (568, "Dota 2", 8,85, data,"PS5");
		Produto [3] = new Console (568, "Sonic", 6,150, data,"PS5");
		
		//Produto p2 = new Produto (768, "Dota2", 8,95, data);
				LocalDate data2 = LocalDate.of(2013, 12, 3);
		
				 for (Produto produ : Produto) {
			           produ.vizualizar();
			        }
		//p1.setDataLancamento(data2);
		//p2.setDataLancamento(data2);
		//p1.visualizar();
		//p2.visualizar();
	}

}
