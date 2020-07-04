package br.edu.iftm.pilhas;

import java.util.EmptyStackException;

public interface Pilha {
	public void empilhar(Object valor) throws Exception ;
	
	public Object desempilhar() throws Exception;
	
	public Object olharTopo() throws Exception;
	
	public boolean estaVazia();
	
	public boolean estaCheia();
	
	public int pegarTamanho();

}
