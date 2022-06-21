package Pilha;

public class Pilha {
	No topo;
	int qtd = 0;

	boolean isEmpty() {
		return qtd == 0;
	}

	// empilhar
	public void push(String valor) {
		No novo = new No(valor, topo);
		topo = novo;
		qtd++;
	}

	// desempilhar
	public String pop() {
		if (!isEmpty()) {
			String temp = topo.getValor();
			topo = topo.getAnterior();
			qtd--;
			return temp;
		} else {
			return null;
		}
	}

	public String topo() {
		return topo.toString();
	}

	public int quantidade() {
		return qtd;
	}

	public void imprimir() {
		No aux = topo;
		while (aux != null) {
			System.out.println("[" + aux.getValor() + "]");
			aux = aux.getAnterior();
		}
	}
}