package Circular;

public class main {

	public static void main(String[] args) {

		ListaCircular lista = new ListaCircular();
		
		lista.insereOrdenado(3);
		lista.insereOrdenado(6);
		lista.insereOrdenado(2);
		lista.insereOrdenado(5);
		lista.imprimir();
		
		// tentando apagar numero que nao existe na lista;
		lista.deletar(7);
		
		
		lista.deletar(6);
		lista.deletar(3);
		lista.deletar(5);
		lista.deletar(2);
		
		//deletando numero em lista vazia existe;
		lista.deletar(6);
		
		//inserindo novamente;
		lista.insereOrdenado(3);
		lista.insereOrdenado(6);
		lista.insereOrdenado(2);
		lista.insereOrdenado(5);
		lista.imprimir();		
	}

}