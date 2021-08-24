package br.com.lucio.proxy.exemplo3;

import java.io.IOException;

public interface AcessoRemoto {
	public byte[] buscarArquivo(String url) throws IOException;
}
