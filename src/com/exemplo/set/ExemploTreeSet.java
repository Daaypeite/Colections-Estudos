package com.exemplo.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		// operacao com TreeSet
		TreeSet<String> treinamentos = new TreeSet<>();

		// fazendo uso do objeto treinamentos
		treinamentos.add("Java");
		treinamentos.add("Javascript");
		treinamentos.add("SQL");
		treinamentos.add("ASP.NET");
		treinamentos.add("C#");

		// fazer uso do metodo Iterator
		Iterator<String> iterator = treinamentos.iterator();
		System.out.println("Treinamentos ordenados por ordem alfabetica: \n ");

		//loop para exibir valores
		while (iterator.hasNext()) {
			String nomesTreinamentos = iterator.next();
			System.out.println("Nome do treinamento - " + nomesTreinamentos);

		}
	}

}
