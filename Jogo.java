package aula01;

import java.time.LocalDate;

public class Jogo  extends Produto  {
	
	private String nodelo;

	public Jogo(float codigo, String nome, int versao, float preco, LocalDate dataLancamento, String nodelo) {
		super(codigo, nome, versao, preco, dataLancamento);
		this.nodelo = nodelo;
	}

	public String getNodelo() {
		return nodelo;
	}

	public void setNodelo(String nodelo) {
		this.nodelo = nodelo;
	}
	
	public void vizualizar() {
		System.out.println("Jogos{" +
				 "codigo='" + getCodigo() + '\'' +
	                ", nome=" + getNome() +
	                ", versao='" + getVersao() + '\'' +
	                ", preco='" + getPreco() + '\'' +
	                ", Data De Lancamento:= '" + dataLancamento +
	                ",Nodelo:=" + nodelo +
	                '}');

	                                                   
	                
	           
				
	}
	
}
