package com.exemplo.removeif;

import java.util.Set;
import java.util.HashSet;

public class ExemploRemoveIf {

	public static void main(String[] args) {
		// praticando e instanciando
		Set<Produto> produto = new HashSet<>();

		// inserindo dados na colecao
		produto.add(new Produto("Leite em pó", "Laticinios", 5.80));
		produto.add(new Produto("Cerveja", "Bebidas", 1.89));
		produto.add(new Produto("Detergente", "Limpeza", 2.49));
		produto.add(new Produto("Manteiga", "Laticinios", 2.90));
		produto.add(new Produto("Creme dental", "Higiene", 1.75));
		produto.add(new Produto("Sabonete", "Higiene", 0.99));

		// uso do metodo removeIf()
		produto.removeIf(qualquer -> qualquer.getPrecoProd() > 2.5);

		// exibir os produtos
		System.out.println("Lista de Produtos:\n");
		produto.forEach(qualquer -> System.out.println("Porduto: " + qualquer));
	}
}
