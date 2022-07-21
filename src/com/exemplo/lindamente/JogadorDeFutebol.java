package com.exemplo.lindamente;

public class JogadorDeFutebol {
	private String nomeJogador;
	private String posicao;
	
	// getters e setters
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	// construtor
	public JogadorDeFutebol(String nomeJogador, String posicao) {
		super();
		this.nomeJogador = nomeJogador;
		this.posicao = posicao;
	}
	
	
}
