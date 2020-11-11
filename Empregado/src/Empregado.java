
public abstract class Empregado {

	
	protected Empregado(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		Sobrenome = sobrenome;
		CPF = cpf;
	}

	String nome;
	String Sobrenome;
	String CPF;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public abstract double Vencimento();
	
}
