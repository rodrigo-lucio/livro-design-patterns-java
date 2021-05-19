package br.com.lucio.nullobject;

public class ApresentacaoCarrinho {
	public void colocarInformacoesCarrinho(HTTPServletRequest request) {

		// Deverá retornar @see CarrinhoNulo quando nenhum carrinho do usuario for encontrado
		Carrinho c = CookieFactory.criarCarrinho(request);

		request.setAttribute("valor", c.getValor());
		request.setAttribute("qtd", c.getTamanho());
		if (request.getAttribute("username") == null) {
			request.setAttribute("userCarrinho", c.getNomeUsuario());
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));

		}
	}
}
