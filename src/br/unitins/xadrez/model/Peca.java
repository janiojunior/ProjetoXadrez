package br.unitins.xadrez.model;

public abstract class Peca {
	private Cor cor;
	private Posicao posicao;
	private boolean nuncaMovida;
	
	public Peca(int linha, int coluna, Cor cor) {
		this.posicao = new Posicao(linha, coluna);
		this.cor = cor;
	}
	
	public abstract boolean mover(Posicao posicao);
	
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	public boolean isNuncaMovida() {
		return nuncaMovida;
	}
	public void setNuncaMovida(boolean nuncaMovida) {
		this.nuncaMovida = nuncaMovida;
	}
	
	@Override
	public String toString() {
		if(this == null) {
			 return " VAZIO";
		} else {
			return this.getClass().getSimpleName() + " - " + this.cor;
		}
	}
	
}
