package br.edu.iftm.pilhas.testes;

import java.util.EmptyStackException;
import java.util.Scanner;

import br.edu.iftm.pilhas.ItemPilha;
import br.edu.iftm.pilhas.PilhaDinamica;

public class PilhaDinamicaTeste {

	public static void main(String[] args) {
		PilhaDinamica pilha = new PilhaDinamica(10);
		String mangaRecebido;

		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i <= pilha.pegarTamanho(); i++) {
				System.out.println("Digite o manga que sera guardado: ");
				mangaRecebido = sc.nextLine();
				
				if(pilha.estaVazia()) {
					System.out.println("Deu certo");
					pilha.empilhar(mangaRecebido);
					System.out.println(pilha.olharTopo());
				}else if(pilha.estaCheia()){
					System.out.println("Deu errado a pilha esta cheia");
					pilha.desempilhar();
					System.out.println(pilha.olharTopo());
				}else {
					pilha.empilhar(mangaRecebido);
					System.out.println("Ainda é possivel adicionar mais um mangá!!");
					System.out.println(pilha.olharTopo());
				}
			}
			

			
		} catch (EmptyStackException e) {
			System.out.println("Nenhum manga adicionado!!");
		}

		catch (Exception e) {
			System.out.println("Outro erro tratado");
			System.out.println(e.getMessage());
		}

	}
	
	
}
