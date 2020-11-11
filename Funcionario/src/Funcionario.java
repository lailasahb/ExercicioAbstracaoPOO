public abstract class Funcionario {
		
	public Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String nome;
	public double salario;
	public String cargo;
		

	public double getSalario() {
		return salario;
	}

	public double setSalario(double salario, double bonificacao) {
		return this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public abstract String ObterCargo();
	
	 
	public double ObterSalario() {
		return 0;
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
