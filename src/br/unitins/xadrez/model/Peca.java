package br.unitins.xadrez.model;

public abstract class Peca {
	
	private Cor cor;
	private Posicao posicao;
	private boolean nuncaMovida;
	
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
	
	
}
