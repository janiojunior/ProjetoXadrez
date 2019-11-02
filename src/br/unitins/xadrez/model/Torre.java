package br.unitins.xadrez.model;

public class Torre extends Peca{

	public Torre(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
	}

	@Override
	public boolean mover(Posicao posicao) {
//		//Movimento para frente  
//			if(posicao.getLinha()==getPosicao().getLinha()+1||posicao.getLinha()==getPosicao().getLinha()+2|| 
//				posicao.getLinha()==getPosicao().getLinha()+3||posicao.getLinha()==getPosicao().getLinha()+4||
//				posicao.getLinha()==getPosicao().getLinha()+5||posicao.getLinha()==getPosicao().getLinha()+6||
//				posicao.getLinha()==getPosicao().getLinha()+7||
//		//Movimento para trás
//				posicao.getLinha()==getPosicao().getLinha()-1||posicao.getLinha()==getPosicao().getLinha()-2||
//				posicao.getLinha()==getPosicao().getLinha()-3||posicao.getLinha()==getPosicao().getLinha()-4||
//				posicao.getLinha()==getPosicao().getLinha()-5||posicao.getLinha()==getPosicao().getLinha()-6||
//				posicao.getLinha()==getPosicao().getLinha()-7||
//		//Movimento em coluna 
//				posicao.getColuna()==getPosicao().getColuna()+1||posicao.getColuna()==getPosicao().getColuna()+2||
//				posicao.getColuna()==getPosicao().getColuna()+3||posicao.getColuna()==getPosicao().getColuna()+4||
//				posicao.getColuna()==getPosicao().getColuna()+5||posicao.getColuna()==getPosicao().getColuna()+6||
//				posicao.getColuna()==getPosicao().getColuna()+7||
//		//Movimento em coluna voltando
//				posicao.getColuna()==getPosicao().getColuna()-1||posicao.getColuna()==getPosicao().getColuna()-2||
//				posicao.getColuna()==getPosicao().getColuna()-3||posicao.getColuna()==getPosicao().getColuna()-4||
//				posicao.getColuna()==getPosicao().getColuna()-5||posicao.getColuna()==getPosicao().getColuna()-6||
//				posicao.getColuna()==getPosicao().getColuna()-7) 
		if(posicao.getLinha()==getPosicao().getLinha()+1 && posicao.getColuna()==getPosicao().getColuna()){
				return true;
			}
		return false;
	}
}
