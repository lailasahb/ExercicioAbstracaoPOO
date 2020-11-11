public class Assalariado extends Empregado {

	protected Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		setSalario(salario);
	}

	public double salario;

	public double Vencimento() {
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
