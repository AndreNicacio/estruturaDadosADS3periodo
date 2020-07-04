package br.edu.iftm.pilhas;

import java.util.EmptyStackException;

public class PilhaDinamica implements Pilha{
	private ItemPilha primeiro;
	private String primeiro2;
	private String primeiro3;
	private int capacidade;
	private int tamanho;

	
	// Metodo construtor com especifica da capacidade
	public PilhaDinamica(int capacidade) {
		this.capacidade = capacidade;
		this.tamanho = 0;
	}
	
	// Metodo construtor sem especificar a capcidade
	public PilhaDinamica() {
		this.tamanho = 0;
	}


	@Override
	public void empilhar(Object valor) throws Exception {
		if(estaCheia()) {
			throw new Exception("A pilha esta cheia");
		}
		ItemPilha novoItem = new ItemPilha(valor);
		novoItem.setProximo(primeiro);
		this.primeiro = novoItem;
		
		tamanho++;
		
	}

	@Override
	public Object desempilhar() throws Exception {

		ItemPilha itemDesempilhado = pegarDoTopo();
		
		if (tamanho == 1) {
			this.primeiro = null;
			
		}else {
			this.primeiro = primeiro.getProximo();
		}
		tamanho--;		
		
		return itemDesempilhado;
	} 

	@Override
	public Object olharTopo() throws Exception {
		return pegarDoTopo();
	}
	
	private ItemPilha pegarDoTopo() {
		if(estaVazia()) {
			throw new EmptyStackException();
		}
		return primeiro;
	}
	
	public Object catarTopo() {
		if(estaVazia()) {
			throw new EmptyStackException();
		}
		return primeiro;
	}
	
	

	@Override
	public boolean estaVazia() {
		return (tamanho == 0);
	}

	@Override
	public boolean estaCheia() {	
		if (capacidade > 0) {
			return (tamanho == capacidade);
		}
		return false;
		
	}

	@Override
	public int pegarTamanho() {
		return tamanho;
	}

	public ItemPilha getPrimeiro() {
		return primeiro;
	}

	
}
