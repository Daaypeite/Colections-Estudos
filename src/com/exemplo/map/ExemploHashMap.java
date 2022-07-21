package com.exemplo.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExemploHashMap {

	public static void main(String[] args) {
		// praticando e instanciando
				HashMap<String, Produto> mapProduto = new HashMap<>();

				// inserindo dados na colecao
				mapProduto.put("Leite",new Produto("Leite em pó", "Laticinios", 5.80));
				mapProduto.put("Cerveja",new Produto("Cerveja", "Bebidas", 1.89));
				mapProduto.put("Detergente",new Produto("Detergente", "Limpeza", 2.49));
				mapProduto.put("Manteiga",new Produto("Manteiga", "Laticinios", 2.90));
				mapProduto.put("Creme",new Produto("Creme dental", "Higiene", 1.75));
				mapProduto.put("Sabonete",new Produto("Sabonete", "Higiene", 0.99));

				// verificar se o mep possui um determinado intem
				System.out.println(mapProduto.containsKey("Cerveja"));
				
				// obter o elemento chave
				System.out.println(mapProduto.get("Manteiga"));
				
				//remover um intem
				mapProduto.remove("Detergente");
				
				//mostrar a qtda de itens que compoem a colecao
				System.out.println(mapProduto.size());
				
				System.out.println("==================================");
				
				//exibir todos os itens do map
				mapProduto.forEach((chave, valor) -> System.out.println(valor));
				
			}

	}
