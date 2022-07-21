package com.exemplo.lindamente;

public class Colaborador {
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Colaborador(int matricula, String nome, String cargo, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String toString() {
		return this.getMatricula() + "\t" + this.getNome() + "\t" + this.getCargo() + "\t" + this.getSalario();
	}

}
