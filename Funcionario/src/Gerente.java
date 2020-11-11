
public class Gerente extends Funcionario {

	public Gerente(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		
	}


	public double bonificacao;
	public String cargo;
	public double salario;
	
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
		this.bonificacao = 0.20;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = "Gerente";
	}



}
