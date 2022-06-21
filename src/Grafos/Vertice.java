package Grafos;

import java.util.ArrayList;

public class Vertice {
    int verticeIni;
    No verticeAdj = null;
    No ultimo = null;
    
    public Vertice(int verticeIni){
    	this.verticeIni = verticeIni;
    }
    
    public void adicionarNo(int valor){
    	No novo = new No(valor, null);
		if(verticeAdj == null) {
			verticeAdj = novo;
			ultimo = novo;
		}else{
			ultimo.setProx(novo);
			novo.setProx(null);
			ultimo = novo;
		}
    }
	public int getVertice() {
		return verticeIni;
	}

	public void setVertice(int verticeIni) {
		this.verticeIni = verticeIni;
	}

	public No getVerticeAdj() {
		return verticeAdj;
	}

	public void setVerticeAdj(No verticeAdj) {
		this.verticeAdj = verticeAdj;
	}
    
    
}