package Arvore;

import java.util.Arrays;

import Ordenacao.MergeSort;

public class main {

	public static void main(String[] args) {

		Arvore ar = new Arvore();

		ar.inserir(10);
		ar.inserir(8);
		ar.inserir(5);
		ar.inserir(9);
		ar.inserir(7);
		ar.inserir(18);
		ar.inserir(13);
		ar.inserir(20);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(20);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(5);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(8);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(9);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(13);
		ar.remover(18);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);

		ar.remover(10);
		System.out.println("---------------------------------------\n"
				+ "imprimindo em Ordem");
		ar.emOrdem(ar.topo);
	}
}