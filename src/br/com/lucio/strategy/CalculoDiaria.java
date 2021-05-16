package br.com.lucio.strategy;

public class CalculoDiaria implements CalculoValor {

	private double valorDiaria;

	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public double calcular(long periodo) {
		return valorDiaria * Math.ceil(periodo / HORA);
	}
	
}
