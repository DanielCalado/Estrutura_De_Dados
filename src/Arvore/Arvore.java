package Arvore;

public class Arvore {
	No topo = null;

	public Arvore() {
	}

	public void inserir(int valor) {

		No novo = new No();
		novo.setValor(valor);
		novo.setEsquerda(null);
		novo.setDireita(null);
		if (topo == null) {
			topo = novo;
		} else {
			No aux = topo;

			while (true) {
				if (novo.getValor() < aux.getValor()) {
					if (aux.getEsquerda() != null) {
						aux = aux.getEsquerda();
					} else {
						aux.setEsquerda(novo);
						break;
					}
				} else {
					if (aux.getDireita() != null) {
						aux = aux.getDireita();
					} else {
						aux.setDireita(novo);
						break;
					}
				}
			}
		}
	}

	public No buscar(int valor) {
		No aux = topo;

		while (true) {
			if (valor < aux.getValor()) {
				if (aux.getValor() == valor) {
					return aux;
				} else {
					if (aux.getEsquerda() == null) {
						aux = null;
						return aux;
					} else {
						aux = aux.getEsquerda();
					}
				}
			} else {
				if (aux.getValor() == valor) {
					return aux;
				} else {
					if (aux.getDireita() == null) {
						aux = null;
						return aux;
					} else {
						aux = aux.getDireita();
					}
				}
			}

		}
	}

	public void emOrdem(No atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}

	}

	public void remover(int valor) {
		No atual = this.topo;
		No paiAtual = null;
		while (atual != null) {
			if (atual.getValor() == valor) {
				break;
			} else if (valor < atual.getValor()) {
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		if (atual != null) {
			if (atual.getDireita() != null) {// um filho a direita
				No substituto = atual.getDireita();
				No paiSubstituto = atual;
				while (substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else {// no caso de tentar remover a raiz
					this.topo = substituto;
				}
				// remove elemento
				if (substituto.getValor() < paiSubstituto.getValor()) {
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else if (atual.getEsquerda() != null) {// um filho a esquerda
				No substituto = atual.getEsquerda();
				No paiSubstituto = atual;
				while (substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else {// se for a raiz
					this.topo = substituto;
				}
				// remove elemento
				if (substituto.getValor() < paiSubstituto.getValor()) {
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else {// nenhum filho
				if (paiAtual != null) {
					if (atual.getValor() < paiAtual.getValor()) {
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else {
					this.topo = null;
				}
			}
		}
	}
}