package aula01;

import java.time.LocalDate;

public class Produto {

	private float codigo;
	private String nome;
	private int versao;
	private float preco;
	protected LocalDate dataLancamento;
	
	
	public Produto(float codigo, String nome, int versao, float preco, LocalDate dataLancamento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.versao = versao;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
	}


	public float getCodigo() {
		return codigo;
	}


	public void setCodigo(float codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getVersao() {
		return versao;
	}


	public void setVersao(int versao) {
		this.versao = versao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public LocalDate getDataLancamento() {
		return dataLancamento;
	}


	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public void vizualizar() {		
}
	
}
