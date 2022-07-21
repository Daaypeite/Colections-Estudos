package com.exemplo.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		// definindo uma lista
		List<String> paises = new ArrayList<>();

		// inserindo dados na colecao
		paises.add("Brasil");
		paises.add("Portugual");
		paises.add("Estados Unidos");
		paises.add("Franca");
		paises.add("Inglaterra");
		paises.add(2, "Itália");

		// exibindo valores
		System.out.println("Paises na ordem original: ");
		paises.forEach(curso -> System.out.println(" - " + curso));

		System.out.println("===============================");

		// verificar se a lista possui o valor Estados Unidos
		System.out.println(paises.contains("Estados Unidos"));

		// exibir o elemento da posicao 2
		System.out.println(paises.get(2));

		// exibindo o tamanho da lista
		System.out.println(paises.size());

		// exibir o indice posicional do valor Franca
		System.out.println(paises.indexOf("Franca"));

		// transformar os elementos com valores descritos em letras maiusculas
		paises.replaceAll(maiusculo -> maiusculo .toUpperCase());

		// reordenar a lista utilizando a ordem natural das Strings
		paises.sort((x, y) -> x.compareTo(y));

		System.out.println("===============================");

		System.out.println("Paises ordenados e em maiusculo: ");

		paises.forEach(curso -> System.out.println(" - " + curso));
	}

}
