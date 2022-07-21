package com.exemplo.removeif;

public class Produto {
	// atributos
	private String nomeProd;
	private String categoriaPord;
	private double precoProd;

	// getters e setters
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getCategoriaPord() {
		return categoriaPord;
	}

	public void setCategoriaPord(String categoriaPord) {
		this.categoriaPord = categoriaPord;
	}

	public double getPrecoProd() {
		return precoProd;
	}

	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}

	// construtor
	public Produto(String nomeProd, String categoriaPord, double precoProd) {
		super();
		this.nomeProd = nomeProd;
		this.categoriaPord = categoriaPord;
		this.precoProd = precoProd;
	}
}
