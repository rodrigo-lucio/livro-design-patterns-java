package br.com.lucio.factorymethod;

import java.util.List;

public interface DAO<E> {
	public E recuperarPorId(Object id);
	public void salvar(E entidade);
	public void excluir(Object id);
	public List<E> listarTodos();
}
