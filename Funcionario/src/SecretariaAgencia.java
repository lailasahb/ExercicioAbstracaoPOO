
public abstract class SecretariaAgencia extends Secretaria{
	
	private double bonificacao;


	public SecretariaAgencia(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		
	}
	
	public String ObterCargo() {
		
		return getCargo();
	}

	
	public double ObterSalario(double salario, double bonificacao) {
		
		return this.salario = getSalario() * (getSalario()*bonificacao);
	}


	public double getBonificacao() {
		return bonificacao;
	}


	public void setBonificacao(double bonificacao) {
		this.bonificacao = 0.05;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = "Secretaria Agencia";
	}



}
