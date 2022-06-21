package hashTable;

public class hashTable {
	ListaEncadeada vetor[];

	public hashTable() {
	}

	public void hashTable(int n) {
		vetor = new ListaEncadeada[n];

		for (int i = 0; i < n; i++) {
			vetor[i] = new ListaEncadeada();
		}
	}

	private int calculoHash(String texto) {
		int posicao = 0;
		// t + 3
		for (int i = 0; i < texto.length(); i++) {
			posicao = posicao + (texto.charAt(i) * (texto.length() - i));
		}
		posicao = posicao % vetor.length;

		return posicao;
	}

	public void adicionar(String valor) {
		vetor[calculoHash(valor)].salvar(valor);
	}
	
	public boolean buscar(String valor){
		if(vetor[calculoHash(valor)].buscar(valor) == valor){
			return true;
		}
		return false;
	}
	
	public void imprimirPosicaoTabela(String valor){
		vetor[calculoHash(valor)].imprimir();
	}
	
	public void remove(String valor){
		if(vetor[calculoHash(valor)].buscar(valor) == valor){
			vetor[calculoHash(valor)].deletar(valor);
		}else{
			System.out.println("valor nao existe!");
		}
	}

	public void imprimir() {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getPrimeiro() != null) {
				System.out.println("***Elementos da " + (i + 1) + "ª posição***");
				vetor[i].imprimir();
			}
		}
	}
}
