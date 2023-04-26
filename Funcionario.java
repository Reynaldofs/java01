package aula01;

public class Funcionario {

	private String nome;
	private String email;
	private String sexo;
	private String telefone;
	private int idade;
	
	
	public Funcionario(String nome, String email, String sexo, String telefone, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.telefone = telefone;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	 public void visualizar() {
	    	System.out.println("Funcionario");
	        System.out.println("Nome: " + nome);
	        System.out.println("E-mail: " + email);
	        System.out.println("Telefone: " + sexo);
	        System.out.println("Endereço: " + telefone);
	        System.out.println("Idade" + idade);
	    }
}
