package br.com.lucio.hookmethod;

public abstract class SuperClasse {

	
	public void metodoPrincipal() {
		System.out.println("Antes gancho");
		metodoGancho();
		System.out.println("Depois gancho");
	}
	
	abstract void metodoGancho();
	
}
