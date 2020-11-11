public class Comissionado extends Empregado {

	protected Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}
	public double totalVenda;
	public double taxaComissao;
	
	
	public double getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	public double Vencimento() {
		return totalVenda * taxaComissao;
	}
	
}
