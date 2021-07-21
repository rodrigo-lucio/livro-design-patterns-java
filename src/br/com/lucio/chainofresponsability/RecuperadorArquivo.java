package br.com.lucio.chainofresponsability;

public abstract class RecuperadorArquivo {
	private RecuperadorArquivo proximo;

	public RecuperadorArquivo(RecuperadorArquivo proximo) {
		this.proximo = proximo;
	}

	public Arquivo recuperar(String nome) {
		Arquivo a = recuperaArquivo(nome);
		if (a == null || !a.isValido())
			return chamarProximo(nome);
		else
			return a;
	}

	public Arquivo chamarProximo(String nome) {
		if (proximo == null)
			throw new RuntimeException("N�o foi poss�vel recuperar o arquivo");
		return proximo.recuperar(nome);
	}

	protected abstract Arquivo recuperaArquivo(String nome);
}