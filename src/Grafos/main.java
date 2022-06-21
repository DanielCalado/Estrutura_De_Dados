package Grafos;

public class main {
	 public static void main(String[] args) {
	        Grafo grafo = new Grafo();
	        
	        grafo.inserirNoGrafo(1);
	        grafo.inserirNoGrafo(2);
	        grafo.inserirNoGrafo(3);
	        grafo.inserirNoGrafo(4);
	        grafo.inserirNoGrafo(5);
	        grafo.inserirNoGrafo(6);
	        grafo.inserirNoGrafo(7);
	        grafo.inserirNoGrafo(8);
	        
	        grafo.conecta(1, 2);
	        grafo.conecta(1, 3);
	        grafo.conecta(1, 4);
	        
	        grafo.conecta(2, 1);
	        grafo.conecta(2, 4);
	        grafo.conecta(2, 5);
	        
	        grafo.conecta(3, 1);
	        	        
	        grafo.conecta(5, 2);
	        
	        grafo.conecta(6, 5);
	        grafo.conecta(6, 7);
	        grafo.conecta(6, 8);
	        
	        grafo.conecta(7, 6);
	        
	        grafo.conecta(8, 6);
	        
	       grafo.imprimir();
	        
	        grafo.BFS(1);
	    }
	    
}
