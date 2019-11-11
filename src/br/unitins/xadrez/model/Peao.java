package br.unitins.xadrez.model;

import br.unitins.xadrez.base.Tabuleiro;

public class Peao extends Peca {
	boolean movInicial = true;

	public Peao(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
//		this.setNuncaMovida(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mover(Posicao posicao) {

		if (this.getCor() == Cor.BRANCA) {
			if (movInicial == true
					&& (posicao.getLinha() == getPosicao().getLinha() - 2
							&& posicao.getColuna() == getPosicao().getColuna())
					|| posicao.getLinha() == getPosicao().getLinha() - 1
							&& posicao.getColuna() == getPosicao().getColuna()) {
				movInicial = false;
				return true;
			} else if (movInicial == false && (posicao.getLinha() == getPosicao().getLinha() - 1
					&& posicao.getColuna() == getPosicao().getColuna())) {
				return true;
			} else if ((Tabuleiro.getPeca(posicao).getCor() != this.getCor() && posicao.getColuna() == getPosicao().getColuna() + 1
					&& posicao.getLinha() == getPosicao().getLinha() - 1 ) || (Tabuleiro.getPeca(posicao).getCor() != this.getCor() && posicao.getColuna() == getPosicao().getColuna() - 1
					&& posicao.getLinha() == getPosicao().getLinha() - 1 )) {
				return true;
			}
		}
		if (this.getCor() == Cor.PRETA) {
			if (movInicial == true
					&& (posicao.getLinha() == getPosicao().getLinha() + 2
							&& posicao.getColuna() == getPosicao().getColuna())
					|| (posicao.getLinha() == getPosicao().getLinha() + 1
							&& posicao.getColuna() == getPosicao().getColuna())) {
				movInicial = false;
				return true;
			} else if (movInicial == false && (posicao.getLinha() == getPosicao().getLinha() + 1
					&& posicao.getColuna() == getPosicao().getColuna())) {
				return true;
			} else if (((Tabuleiro.getPeca(posicao).getCor() != this.getCor() && Tabuleiro.getPeca(posicao) != null) && posicao.getColuna() == getPosicao().getColuna() + 1
					&& posicao.getLinha() == getPosicao().getLinha() + 1 ) || (Tabuleiro.getPeca(posicao).getCor() != this.getCor() && posicao.getColuna() == getPosicao().getColuna() - 1
					&& posicao.getLinha() == getPosicao().getLinha() + 1 )) {
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean checarTrajetoria(Posicao posicao) {
		int i = getPosicao().getLinha();
		int j = getPosicao().getColuna();
		if (this.getCor() == Cor.BRANCA) {
			while (i != posicao.getLinha()) {
				i--;
				if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		} else {
			while (i != posicao.getLinha()) {
				i++;
				if (Tabuleiro.verificadorNulo(i, j) == false)
					return false;
			}
		}
		return true;
	}
}
