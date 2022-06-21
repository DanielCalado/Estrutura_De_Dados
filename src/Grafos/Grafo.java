package Grafos;

import java.util.ArrayList;

public class Grafo {
	int numVertices = 0;
	ArrayList<Vertice> vertices = new ArrayList<Vertice>();

	public Grafo() {

	}

	public void inserirNoGrafo(int valor) {
		Vertice v = new Vertice(valor);
		vertices.add(v);
		numVertices++;
	}

	public void conecta(int v1, int v2) {
		for (int i = 0; i < vertices.size(); i++) {
			if (vertices.get(i).getVertice() == v1) {
				vertices.get(i).adicionarNo(v2);
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < numVertices; i++) {
			Vertice v = vertices.get(i);
			String text = "";
			System.out.println("Lista vertice "+ (i+1) +":");
			if (v.getVerticeAdj() != null) {
				No aux = v.getVerticeAdj();

				if (aux.getProx() == null) {
					System.out.println(aux.getValor());
				} else {
					while (true) {
						System.out.println(aux.getValor());
						if (aux.getProx() == null) {
							break;
						}
						aux = aux.getProx();
					}
				}
				
			}
		}
	}

	public void BFS(int s) {
		if (s < 0) {
			s = 0;
		}
		if (s >= numVertices) {
			s = numVertices;
		}
		
		int[] cor = new int[numVertices];
		int[] pai = new int[numVertices];
		int[] dist = new int[numVertices];
		
		for(int i = 0; i < numVertices; i++){
			cor[i] = 0;
			pai[i] = -1;
			dist[i] = -1;
		}
		
		cor[s-1] = 1;
		dist[s-1] = 0;
		
		Fila fila = new Fila();
		
		fila.enqueue(s);
		
		while(fila.filaVazia() != true){
			int origem = fila.dequeue();
			Vertice vertice = vertices.get(origem-1);
			No aux = vertice.verticeAdj;
			while(true){
			if(aux != null){
				if(cor[aux.getValor() -1]==0){
					cor[aux.getValor() -1] = 1;
					pai[aux.getValor() -1] = origem;
					dist[aux.getValor() -1] = dist[origem-1] + 1;
					fila.enqueue(aux.getValor());
				}
			}
			if(aux == null){
				break;
			}
			aux = aux.getProx();
			
			}
			
		}
		
		for(int i = 0; i < numVertices; i++){
			System.out.println(vertices.get(i).verticeIni + " pai: "+ pai[i] + " dist: " + dist[i]);
		}
	}
}