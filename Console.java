package aula01;

import java.time.LocalDate;

public class Console extends Produto {

	private String consoleN;

	public Console(float codigo, String nome, int versao, float preco, LocalDate dataLancamento, String consoleN) {
		super(codigo, nome, versao, preco, dataLancamento);
		this.consoleN = consoleN;
	}

	public String getConsoleN() {
		return consoleN;
	}

	public void setConsoleN(String consoleN) {
		this.consoleN = consoleN;
	}
	
	public void vizualizar() {
		System.out.println("Jogos{" +
				 "codigo='" + getCodigo() + '\'' +
	                ", nome=" + getNome() +
	                ", versao='" + getVersao() + '\'' +
	                ", preco='" + getPreco() + '\'' +
	                ", Data De Lancamento:= '" + dataLancamento +
	                ",Console:=" + getConsoleN() +
	                '}');
	}
}
