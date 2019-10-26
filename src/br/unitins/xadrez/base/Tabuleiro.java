package br.unitins.xadrez.base;

import java.util.HashMap;
import java.util.Map;

import br.unitins.xadrez.model.Peca;
import br.unitins.xadrez.model.Posicao;

public class Tabuleiro {
	// posicao = linha e coluna
	//private Peca[][] matrizTabuleiro = new Peca[8][8]; //Matriz tabuleiro
	public static Map<Integer, String> matrizTabuleiro = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		matrizTabuleiro.put(1, "Um");
		matrizTabuleiro.put(2, "dois");
		matrizTabuleiro.put(3, "tres");
		matrizTabuleiro.put(4, "cuatro");
		matrizTabuleiro.put(5, "cinco");
		matrizTabuleiro.put(6, "seis");
		
		System.out.println(matrizTabuleiro.get(1));
		
		
		
	}
	
//	public Peca getPeca(Posicao posicao) {
////		return matrizTabuleiro[posicao.getLinha()][posicao.getColuna()];
//	}
	
}
