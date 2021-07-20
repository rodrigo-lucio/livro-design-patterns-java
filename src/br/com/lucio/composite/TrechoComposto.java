package br.com.lucio.composite;

public class TrechoComposto implements TrechoAereo {

	private TrechoAereo primeiro;
	private TrechoAereo segundo;
	public double taxaConexao;
		
	public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaConexao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.taxaConexao = taxaConexao;
	}

	public String getOrigem() {
		return primeiro.getOrigem();
	}
	
	public String getDestino() {
		return segundo.getDestino();
	}
	
	
	public double getPreco() {
		return primeiro.getPreco() + segundo.getPreco() + taxaConexao;
	}
	
	
}
