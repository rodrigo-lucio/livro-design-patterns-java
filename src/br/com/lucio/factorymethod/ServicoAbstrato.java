package br.com.lucio.factorymethod;

import java.io.IOException;

import br.com.lucio.templatemethod.GeradorArquivo;

public abstract class ServicoAbstrato<E> {

	public GeradorArquivo gerador;

	public ServicoAbstrato(GeradorArquivo gerador) {
		this.gerador = gerador;
	}

	public abstract DAO<E> getDAO();

	// Serviço geral
	public void gravarEntidadeEmArquivo(Object id, String nomeArquivo) throws IOException {
		E entidade = getDAO().recuperarPorId(id);
		gerador.gerarArquivo(nomeArquivo, ((Entidade) entidade).getMapa());

	}
}
