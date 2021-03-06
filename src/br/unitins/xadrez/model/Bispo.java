package br.unitins.xadrez.model;

import br.unitins.xadrez.base.Tabuleiro;

public class Bispo extends Peca {

	public Bispo(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Formas de movimentação: 1. Apenas diagonais, sem limite de casas (+x, +x /
	 * +x, -x / -x, -x / -x, +x); (COMPLETO)
	 */

	@Override
	public boolean mover(Posicao posicao) {
		if ((posicao.getColuna() == getPosicao().getColuna() + 1 && posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 2
						&& posicao.getLinha() == getPosicao().getLinha() + 2)
				|| (posicao.getColuna() == getPosicao().getColuna() + 2
						&& posicao.getLinha() == getPosicao().getLinha() - 2)
				|| (posicao.getColuna() == getPosicao().getColuna() - 2
						&& posicao.getLinha() == getPosicao().getLinha() - 2)
				|| (posicao.getColuna() == getPosicao().getColuna() - 2
						&& posicao.getLinha() == getPosicao().getLinha() + 2)
				|| (posicao.getColuna() == getPosicao().getColuna() + 3
						&& posicao.getLinha() == getPosicao().getLinha() + 3)
				|| (posicao.getColuna() == getPosicao().getColuna() + 3
						&& posicao.getLinha() == getPosicao().getLinha() - 3)
				|| (posicao.getColuna() == getPosicao().getColuna() - 3
						&& posicao.getLinha() == getPosicao().getLinha() - 3)
				|| (posicao.getColuna() == getPosicao().getColuna() - 3
						&& posicao.getLinha() == getPosicao().getLinha() + 3)
				|| (posicao.getColuna() == getPosicao().getColuna() + 4
						&& posicao.getLinha() == getPosicao().getLinha() + 4)
				|| (posicao.getColuna() == getPosicao().getColuna() + 4
						&& posicao.getLinha() == getPosicao().getLinha() - 4)
				|| (posicao.getColuna() == getPosicao().getColuna() - 4
						&& posicao.getLinha() == getPosicao().getLinha() - 4)
				|| (posicao.getColuna() == getPosicao().getColuna() - 4
						&& posicao.getLinha() == getPosicao().getLinha() + 4)
				|| (posicao.getColuna() == getPosicao().getColuna() + 5
						&& posicao.getLinha() == getPosicao().getLinha() + 5)
				|| (posicao.getColuna() == getPosicao().getColuna() + 5
						&& posicao.getLinha() == getPosicao().getLinha() - 5)
				|| (posicao.getColuna() == getPosicao().getColuna() - 5
						&& posicao.getLinha() == getPosicao().getLinha() - 5)
				|| (posicao.getColuna() == getPosicao().getColuna() - 5
						&& posicao.getLinha() == getPosicao().getLinha() + 5)
				|| (posicao.getColuna() == getPosicao().getColuna() + 6
						&& posicao.getLinha() == getPosicao().getLinha() + 6)
				|| (posicao.getColuna() == getPosicao().getColuna() + 6
						&& posicao.getLinha() == getPosicao().getLinha() - 6)
				|| (posicao.getColuna() == getPosicao().getColuna() - 6
						&& posicao.getLinha() == getPosicao().getLinha() - 6)
				|| (posicao.getColuna() == getPosicao().getColuna() - 6
						&& posicao.getLinha() == getPosicao().getLinha() + 6)
				|| (posicao.getColuna() == getPosicao().getColuna() + 7
						&& posicao.getLinha() == getPosicao().getLinha() + 7)
				|| (posicao.getColuna() == getPosicao().getColuna() + 7
						&& posicao.getLinha() == getPosicao().getLinha() - 7)
				|| (posicao.getColuna() == getPosicao().getColuna() - 7
						&& posicao.getLinha() == getPosicao().getLinha() - 7)
				|| (posicao.getColuna() == getPosicao().getColuna() - 7
						&& posicao.getLinha() == getPosicao().getLinha() + 7)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checarTrajetoria(Posicao posicao) {
		int i = getPosicao().getLinha();
		int j = getPosicao().getColuna();

		// Verificação de trajetória no sentido: (+)Linha (+)Coluna	
		if(posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() > 0) {
			while(i != posicao.getLinha() && j != posicao.getColuna()) {
				i++;
				j++;
				// Verificaçao especial para evitar a 
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if(Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
			// Verificação de trajetória no sentido: (+)Linha (-)Coluna	
		}if(posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() < 0) {
			while(i != posicao.getLinha() && j != posicao.getColuna()) {
				i++;
				j--;
				// Verificaçao especial para evitar a 
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if(Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
			// Verificação de trajetória no sentido: (-)Linha (+)Coluna	
		}if(posicao.getLinha() - getPosicao().getLinha() < 0 && posicao.getColuna() - getPosicao().getColuna() > 0) {
			while(i != posicao.getLinha() && j != posicao.getColuna()) {
				i--;
				j++;
				// Verificaçao especial para evitar a 
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if(Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		// Verificação de trajetória no sentido: (-)Linha (-)Coluna	
		}if(posicao.getLinha() - getPosicao().getLinha() < 0 && posicao.getColuna() - getPosicao().getColuna() < 0) {
			while(i != posicao.getLinha() && j != posicao.getColuna()) {
				i--;
				j--;
				// Verificaçao especial para evitar a 
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if(Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
			
			
		return true;
	}

}
