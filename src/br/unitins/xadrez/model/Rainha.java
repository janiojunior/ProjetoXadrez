package br.unitins.xadrez.model;

import br.unitins.xadrez.base.Tabuleiro;

public class Rainha extends Peca {

	public Rainha(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
	}

	/**
	 * Movimentação Rainha: 1. Diagonais (BISPO) 2. Linha reta, tanto na vertical,
	 * quanto na horizontal (TORRE)
	 */

	@Override
	public boolean mover(Posicao posicao) {
		// Movimento para frente (Torre)
		if (posicao.getLinha() == getPosicao().getLinha() + 1 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 2 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 3 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 4 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 5 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 6 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() + 7 && posicao.getColuna() == getPosicao().getColuna()
				||
				// Movimento para trás (Torre)
				posicao.getLinha() == getPosicao().getLinha() - 1 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 2 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 3 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 4 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 5 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 6 && posicao.getColuna() == getPosicao().getColuna()
				|| posicao.getLinha() == getPosicao().getLinha() - 7 && posicao.getColuna() == getPosicao().getColuna()
				||
				// Movimento em coluna (Torre)
				posicao.getColuna() == getPosicao().getColuna() + 1 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 2 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 3 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 4 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 5 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 6 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() + 7 && posicao.getLinha() == getPosicao().getLinha()
				||
				// Movimento em coluna voltando (Torre)
				posicao.getColuna() == getPosicao().getColuna() - 1 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 2 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 3 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 4 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 5 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 6 && posicao.getLinha() == getPosicao().getLinha()
				|| posicao.getColuna() == getPosicao().getColuna() - 7 && posicao.getLinha() == getPosicao().getLinha()
				||
				// Movimento em Diagonal (BISPO)
				(posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() + 1)
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
						&& posicao.getLinha() == getPosicao().getLinha() + 7))

		{
			return true;
		}
		return false;
	}

	@Override
	public boolean checarTrajetoria(Posicao posicao) {
		int i = getPosicao().getLinha();
		int j = getPosicao().getColuna();

		// Verificação de trajetória no sentido: (+)Linha
		if (posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() == 0) {
			while (i != posicao.getLinha() || j != posicao.getColuna()) {
				i++;

				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (-)Linha
		if (posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() == 0) {
			while (i != posicao.getLinha() || j != posicao.getColuna()) {
				i--;

				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (+)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() == 0 && posicao.getColuna() - getPosicao().getColuna() > 0) {
			while (i != posicao.getLinha() || j != posicao.getColuna()) {
				j++;

				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (-)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() == 0 && posicao.getColuna() - getPosicao().getColuna() < 0) {
			while (i != posicao.getLinha() || j != posicao.getColuna()) {
				j--;

				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (+)Linha (+)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() > 0) {
			while (i != posicao.getLinha() && j != posicao.getColuna()) {
				i++;
				j++;
				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (+)Linha (-)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() > 0 && posicao.getColuna() - getPosicao().getColuna() < 0) {
			while (i != posicao.getLinha() && j != posicao.getColuna()) {
				i++;
				j--;
				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (+)Linha (-)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() < 0 && posicao.getColuna() - getPosicao().getColuna() > 0) {
			while (i != posicao.getLinha() && j != posicao.getColuna()) {
				i--;
				j++;
				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		// Verificação de trajetória no sentido: (-)Linha (-)Coluna
		if (posicao.getLinha() - getPosicao().getLinha() < 0 && posicao.getColuna() - getPosicao().getColuna() < 0) {
			while (i != posicao.getLinha() && j != posicao.getColuna()) {
				i--;
				j--;
				// Verificaçao especial para evitar a
				// verificação de nulo da ultima posição
				if (i == posicao.getLinha() && j == posicao.getColuna())
					return true;
				// Verificação de nulo cada posição da trajetória
				else if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}

		return true;
	}
}