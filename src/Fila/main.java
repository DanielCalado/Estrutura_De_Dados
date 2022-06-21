package Fila;

public class main {

	public static void main(String[] args) {

		Fila f = new Fila();
		
		f.enqueue(1);
		f.enqueue(3);
		f.enqueue(5);
		f.enqueue(7);
		f.imprimir();
		
		f.dequeue();
		f.dequeue();
		f.dequeue();
		f.dequeue();
		f.imprimir();
		f.dequeue();
		f.enqueue(8);
		f.enqueue(9);
		f.enqueue(3);
		f.imprimir();
	}

}