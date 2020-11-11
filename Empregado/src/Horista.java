
public class Horista extends Empregado {

	protected Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double precoHora;
	public double horasTrabalhadas;
	
	public double getPrecoHora() {
		return precoHora;
	}


	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	@Override
	public double Vencimento() {
		return precoHora * horasTrabalhadas;
	}


	
	

}
