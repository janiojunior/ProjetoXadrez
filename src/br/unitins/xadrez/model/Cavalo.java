package br.unitins.xadrez.model;

public class Cavalo extends Peca {

	public Cavalo(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mover(Posicao posicao) {
		if ((posicao.getColuna() == getPosicao().getColuna() + 2 && posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 2
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 2
						&& posicao.getLinha() == getPosicao().getLinha() + 1)
				|| (posicao.getColuna() == getPosicao().getColuna() - 2
						&& posicao.getLinha() == getPosicao().getLinha() - 1)
				|| (posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() - 2)
				|| (posicao.getColuna() == getPosicao().getColuna() + 1
						&& posicao.getLinha() == getPosicao().getLinha() + 2)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() + 2)
				|| (posicao.getColuna() == getPosicao().getColuna() - 1
						&& posicao.getLinha() == getPosicao().getLinha() - 2)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checarTrajetoria(Posicao posicao) {
		// TODO Auto-generated method stub
		return super.checarTrajetoria(posicao);
	}

}
