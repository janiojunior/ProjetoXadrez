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
	
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
			return this.getClass().getSimpleName() + " - " + this.cor;
	}
		
	public boolean checarTrajetoria(Posicao posicao) {
		return true;
	}
	
}
