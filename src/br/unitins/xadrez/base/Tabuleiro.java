package br.unitins.xadrez.base;

import java.util.HashMap;
import java.util.Map;

import br.unitins.xadrez.model.Bispo;
import br.unitins.xadrez.model.Cavalo;
import br.unitins.xadrez.model.Cor;
import br.unitins.xadrez.model.Peao;
import br.unitins.xadrez.model.Peca;
import br.unitins.xadrez.model.Posicao;
import br.unitins.xadrez.model.Rainha;
import br.unitins.xadrez.model.Rei;
import br.unitins.xadrez.model.Torre;

public class Tabuleiro {
	// posicao = linha e coluna
	// private Peca[][] matrizTabuleiro = new Peca[8][8]; //Matriz tabuleiro
	public static Map<Posicao, Peca> matrizTabuleiro = new HashMap<Posicao, Peca>();
	// Variaveis para teste de acumulo de cores
	private static int countPreto = 0;
	private static int countBranco = 0;

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Peca peca1 = new Peao(0,0, Cor.PRETA);
//		Peca peca2 = new Cavalo(0,1, Cor.PRETA);
//		Peca peca3 = new Torre(0,2, Cor.PRETA);
//		Peca peca4 = new Bispo(0,3, Cor.PRETA);
//		Peca peca5 = new Rainha(0,4, Cor.PRETA);
////		
//		matrizTabuleiro.put(peca1.getPosicao(), peca1);
//		matrizTabuleiro.put(peca2.getPosicao(), peca2);
//		matrizTabuleiro.put(peca3.getPosicao(), peca3);
//		matrizTabuleiro.put(peca4.getPosicao(), peca4);
//		matrizTabuleiro.put(peca5.getPosicao(), peca5);
////		
//		System.out.println(new Posicao(0,0).hashCode());
//		System.out.println(new Posicao(0,0).hashCode());
////		
//		System.out.println(getPeca(0,0));

		// Incializa Tabuleiro
		Tabuleiro.iniciarTabuleiro();

		// Verificação do movimento da peça
//		Peca peca= new Peao(4, 4, Cor.BRANCA);
//		boolean teste = peca.mover(new Posicao(3,4));
//		System.out.println(teste);

		// Movimento da peca
		
		  Tabuleiro.mover(Tabuleiro.getPeca(6, 0), new Posicao(5,1));
//		  Tabuleiro.mover(Tabuleiro.getPeca(2, 2), new Posicao(4,3));
//		  Tabuleiro.mover(Tabuleiro.getPeca(4, 3), new Posicao(5,5));
//		  Tabuleiro.mover(Tabuleiro.getPeca(6, 4), new Posicao(5,5));
//		  Tabuleiro.mover(Tabuleiro.getPeca(6,5), new Posicao(4,5));
		 
		Tabuleiro.imprimir();

	}

	// iniciar as pecas no tabuleiro
	public static void iniciarTabuleiro() {
		matrizTabuleiro.clear();
		matrizTabuleiro.put(new Posicao(0, 0), new Torre(0, 0, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 1), new Cavalo(0, 1, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 2), new Bispo(0, 2, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 3), new Rainha(0, 3, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 4), new Rei(0, 4, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 5), new Bispo(0, 5, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 6), new Cavalo(0, 6, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(0, 7), new Torre(0, 7, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 0), new Peao(1, 0, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 1), new Peao(1, 1, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 2), new Peao(1, 2, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 3), new Peao(1, 3, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 4), new Peao(1, 4, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 5), new Peao(1, 5, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 6), new Peao(1, 6, Cor.PRETA));
		matrizTabuleiro.put(new Posicao(1, 7), new Peao(1, 7, Cor.PRETA));
		// Peças Brancas
		matrizTabuleiro.put(new Posicao(7, 0), new Torre(7, 0, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 1), new Cavalo(7, 1, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 2), new Bispo(7, 2, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 3), new Rainha(7, 3, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 4), new Rei(7, 4, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 5), new Bispo(7, 5, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 6), new Cavalo(7, 6, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(7, 7), new Torre(7, 7, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 0), new Peao(6, 0, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 1), new Peao(6, 1, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 2), new Peao(6, 2, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 3), new Peao(6, 3, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 4), new Peao(6, 4, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 5), new Peao(6, 5, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 6), new Peao(6, 6, Cor.BRANCA));
		matrizTabuleiro.put(new Posicao(6, 7), new Peao(6, 7, Cor.BRANCA));

	}

	public static boolean mover(Peca peca, Posicao novaPosicao) {
		Posicao posicaoAntiga = peca.getPosicao();
		if (peca.checarTrajetoria(novaPosicao) == true) {
			if (peca.mover(novaPosicao)) {
				// Sistema de Comer Peca PS: Falta a verificação se a Peca é da mesma cor e nao
				// deixar comer
				if ((matrizTabuleiro.get(novaPosicao) != null) && (getPeca(novaPosicao).getCor() != peca.getCor())) {
					// Remover depois o if abaixo
					if (getPeca(novaPosicao).getCor() == Cor.BRANCA) {
						countBranco++;
					} else {
						countPreto++;
					}
					matrizTabuleiro.replace(posicaoAntiga, null);
					matrizTabuleiro.remove(novaPosicao, null);
					peca.setPosicao(novaPosicao);
					matrizTabuleiro.put(novaPosicao, peca);
					return true;

				} else if ((matrizTabuleiro.get(novaPosicao) != null)
						&& (getPeca(novaPosicao).getCor() == peca.getCor())) {// Nao precisa porque ele gera null
																				// pointer exception nesse caso, mas é
																				// bom ter
					System.out.println("Movimento Invalido");
					return false;

				} else {
					// Define a posicao nova como posciao atual da peca
					peca.setPosicao(novaPosicao);
					// apagar a posicao antiga
					matrizTabuleiro.replace(posicaoAntiga, null);
					// acicionando a peca na nova posicao
					matrizTabuleiro.put(novaPosicao, peca);
					return true;
				}
			}
		}
		return false;
	}

	public static Peca getPeca(Posicao posicao) {
		return matrizTabuleiro.get(posicao);

	}

	public static Peca getPeca(Integer linha, Integer coluna) {
		return getPeca(new Posicao(linha, coluna));
	}

	public static void imprimir() {
		for (int linha = 0; linha < 8; linha++) {
			System.out.println("");
			for (int col = 0; col < 8; col++) {
				System.out.print(" " + getPeca(linha, col));
				if (getPeca(linha, col) == null)
					System.out.print("         ");
			}
		}
		System.out.println(" \n \n");
		System.out.println("Foram capturadas: \n Brancas: " + countBranco + " Pretas: " + countPreto);
	}

	public static boolean verificadorNulo(int i, int j) {
		if (getPeca(i, j) == null)
			return true;
		else
			return false;
	}

}
