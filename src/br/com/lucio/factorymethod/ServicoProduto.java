package br.com.lucio.factorymethod;

import br.com.lucio.templatemethod.GeradorArquivo;

public class ServicoProduto extends ServicoAbstrato<Produto> {
	
	public ServicoProduto(GeradorArquivo gerador) {
		super(gerador);
	}

	private DAO<Produto> dao;

	public DAO<Produto> getDAO() {
		if (dao == null) {
			dao = new ProdutoDAO();
		}
		return dao;
	}

	//Funcionalidade específica
	public double getPrecoProduto(Object produtoId) {
		Produto p = getDAO().recuperarPorId(produtoId);
		return p.getPreco();
	}
	
}