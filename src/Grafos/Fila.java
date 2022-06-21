package Grafos;

public class Fila {
	No fim = null;
	No inicio = null;
	
	public Fila() {
	}
	public  void enqueue(int info) {
		No novo = new No(info, null);
		if(inicio == null) {
			inicio = novo;
			fim = novo;
		}else{
			fim.setProx(novo);
			novo.setProx(null);
			fim = novo;
		}
		
	}
	public int dequeue() {
		if(filaVazia()) {
			System.out.println("Vazia");
		}else {
			int v = inicio.getValor();
		inicio = inicio.getProx();
		return v;
		}
		return 0;
	}
	public boolean filaVazia() {
		if(inicio == null || fim == null) {
			return true;
		}
		return false;
	}
	public void imprimir(){
		if(filaVazia()) {
			System.out.println("Vazia");
		}else {
	     No aux = inicio;
	     while(aux != null) {
	    	 System.out.println(aux.getValor());
	    	 aux = aux.getProx();
	     }
		}
	}
}