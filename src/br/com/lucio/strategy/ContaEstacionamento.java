package br.com.lucio.strategy;

/*
 * Classe resolvendo o problema com padrão Strategy
 */
public class ContaEstacionamento {
	
	private CalculoValor calculo;
	private Veiculo veiculo;
	private long inicio;
	private long fim;

	public double valorConta() {
		return calculo.calcular(fim - inicio);
	}

	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}

}
