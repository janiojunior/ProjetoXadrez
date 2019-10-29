package br.unitins.xadrez.model;
public class Peao extends Peca{

	public Peao(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mover(Posicao posicao) {
		if(posicao.getColuna()==getPosicao().getColuna()+1) {
			return true;
		}
		return false;
	}


	

}
