package hashTable;

import hashTable.No;

public class No {
    private String valor;
    private No proximo;

    public No() {
    }

    public No(String valor, No proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public String getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }
    
}
