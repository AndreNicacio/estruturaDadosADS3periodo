package br.edu.iftm.pilhas;

public class ItemPilha {
	private ItemPilha proximo;
	private Object valor;
	
	
	public ItemPilha(Object valor) {
		this.valor = valor;
	}

	public ItemPilha(ItemPilha proximo, Object valor) {
		this.proximo = proximo;
		this.valor = valor;
	}

	public ItemPilha getProximo() {
		return proximo;
	}

	public void setProximo(ItemPilha proximo) {
		this.proximo = proximo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return this.valor.toString();
	}

	
	
	
	
	

}
