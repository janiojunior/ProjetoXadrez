package br.unitins.xadrez.model;

public class Rei extends Peca {

	public Rei(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Formas de movimentação: 1. Qualquer direção desde que seja um casa somente
	 * (+1, 0 / 0, +1 / -1, 0 / 0, -1 / +1, +1 / +1, -1 / -1, -1 / -1, +1);
	 * (COMPLETO) 2. Não pode se movimentar em um local de ameaça; 3. Roque
	 * (Necessário a Torre);
	 */

	@Override
	public boolean mover(Posicao posicao) {

		if ((posicao.getColuna() == getPosicao().getColuna() + 1 && posicao.getLinha() == getPosicao().getLinha())
				|| (posicao.getColuna() == getPosicao().getColuna()
						&& posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha())
				|| (posicao.getColuna() == getPosicao().getColuna()
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() + 1)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checarTrajetoria(Posicao posicao) {
		return true;
	}
}