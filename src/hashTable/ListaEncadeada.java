package hashTable;

public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int cont;

	public ListaEncadeada() {
		primeiro = null;
		ultimo = null;
		cont = 0;
	}

	public void salvar(String valor) {
		No novo = new No();
		novo.setValor(valor);

		if (primeiro == null) {
			primeiro = novo;
			ultimo = novo;
			primeiro.setProximo(null);
			cont++;
		} else {
			ultimo.setProximo(novo);
			ultimo = novo;
			cont++;
		}
	}

	public void deletar(String valor) {
		No aux = primeiro;
		No anterior = primeiro;
		if (primeiro.getValor() == valor) {
			primeiro = primeiro.getProximo();
		} else {
			while (true) {
				if (aux.getValor() == valor) {
					anterior.setProximo(aux.getProximo());
					break;
				}
				if (aux.getProximo() == null) {
					break;
				}
				anterior = aux;
				aux = aux.getProximo();
			}
		}
	}

	public String buscar(String valor) {
		No aux = primeiro;
		while (aux != null) {
			if (aux.getValor() == valor) {
				return aux.getValor();
			}
			aux = aux.getProximo();
		}
		return null;
	}

	public void imprimir() {
		No aux = primeiro;
		if (primeiro == null) {
			System.out.println("Não existe elementos.");
		} else {
			while (aux != null) {
				System.out.println(aux.getValor());
				aux = aux.getProximo();
			}
		}
	}

	public No getPrimeiro() {
		return primeiro;
	}

}