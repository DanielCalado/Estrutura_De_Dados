package Pilha;

public class No {
	private String valor;
	private No anterior;

	public No(String valor, No anterior) {
		this.valor = valor;
		this.anterior = anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public No getAnterior() {
		return anterior;
	}

	public String getValor() {
		return valor;
	}

}