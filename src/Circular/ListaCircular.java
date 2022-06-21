package Circular;

import Grafos.No;

public class ListaCircular {
	No primeiro = null;
	No ultimo;
	int qtd = 0;

	public ListaCircular() {

	}

	public boolean listaVazia() {
		return qtd == 0;
	}

	public void insereOrdenado(int num) {
		if (qtd == 0) {
			primeiro = null;
			ultimo = null;
		}
		No novo = new No();
		novo.setValor(num);
		if (primeiro == null) {
			primeiro = novo;
			ultimo = primeiro;
			ultimo.setProx(primeiro);
			primeiro.setProx(ultimo);
			qtd++;
		} else if (num <= primeiro.getValor()) {
			novo.setProx(primeiro);
			primeiro = novo;
			ultimo.setProx(primeiro);
			qtd++;
		} else if (num >= ultimo.getValor()) {
			novo.setProx(primeiro);
			ultimo.setProx(novo);
			ultimo = novo;
			qtd++;
		} else {
			No aux = primeiro;
			for (int i = 0; i < qtd; i++) {
				if (num >= aux.getValor() && num < aux.getProx().getValor()) {
					novo.setProx(aux.getProx());
					aux.setProx(novo);
					qtd++;
					break;
				}
				aux = aux.getProx();
			}
		}
	}

	public void deletar(int num) {
		if (!listaVazia()) {
			int qtdAux = 0;
			if (num == primeiro.getValor()) {
				primeiro = primeiro.getProx();
				ultimo.setProx(primeiro);
				qtd--;
			} else {
				No novo = primeiro;
				for (int i = 0; i < qtd; i++) {
					if (num == ultimo.getValor() && num == novo.getValor()) {
						novo.setProx(primeiro);
						ultimo = novo;
						qtd--;
						break;
					} else if (num == novo.getProx().getValor()) {
						No aux = novo.getProx();
						novo.setProx(aux.getProx());
						qtd--;
						break;
					}
					novo = novo.getProx();
				}
			}
			if (qtdAux == qtd) {
				System.out.println("Numero nao existe na lista.");
			}
		} else {
			System.out.println("lista esta Vazia!!");
		}
	}

	public void imprimir() {
		if (!listaVazia()) {
			No aux = primeiro;
			for (int i = 0; i < qtd; i++) {
				System.out.println(aux.getValor() + " --> "
						+ aux.getProx().getValor());
				aux = aux.getProx();
			}
			aux = null;
		} else {
			System.out.println("lista esta Vazia!!");
		}
	}
}