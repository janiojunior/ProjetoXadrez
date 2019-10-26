package br.unitins.xadrez.base;

import br.unitins.xadrez.model.Peca;
import br.unitins.xadrez.model.Posicao;

public class Tabuleiro {
	// posicao = linha e coluna
	private Peca[][] matrizTabuleiro = new Peca[8][8]; //Matriz tabuleiro
	
	public Peca getPeca(Posicao posicao) {
		return matrizTabuleiro[posicao.getLinha()][posicao.getColuna()];
	}
	
}
