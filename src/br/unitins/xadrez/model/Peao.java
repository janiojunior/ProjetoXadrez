package br.unitins.xadrez.model;
public class Peao extends Peca{
	
	public Peao(int linha, int coluna, Cor cor) {
		super(linha, coluna, cor);
		this.setNuncaMovida(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean mover(Posicao posicao) {
		
		// Se primeiroMovimento = true ele pode andar uma casa a mais
		
		if(this.isNuncaMovida()) {
			
			this.setNuncaMovida(false);
			
			if((posicao.getColuna() == getPosicao().getColuna()+2 && posicao.getLinha() == getPosicao().getLinha() && this.isNuncaMovida())
				||(posicao.getColuna() == getPosicao().getColuna()+1 && posicao.getLinha() == getPosicao().getLinha())) {
				
					return true;
			}
			
		}
		
		// A ideia do if abaixo é verificar se existe uma peca de cor diferente para o peao poder come-la, no entanto, não sei como fazer essa verificacao
		
		/*if((posicao.getLinha()+1 && posicao.getColuna()+1 !=)) {
			
			if(posicao.getColuna() == getPosicao().getColuna()+1 && posicao.getLinha()==getPosicao().getLinha()+1 
			   || posicao.getColuna() == getPosicao().getColuna()-1 && posicao.getLinha()==getPosicao().getLinha()+1) {
				
				return true;
			}
			
		}*/

		return false;
	}


	

}
