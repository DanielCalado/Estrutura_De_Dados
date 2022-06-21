package hashTable;

import java.util.Random;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		hashTable hash = new hashTable();
		hash.hashTable(1000 / 20);

		String[] lista = { "Bala", "Bola", "Abacate", "Abacaxi", "Ajuda",
				"Azedo", "Alicate", "Banana", "Batata", "Beleza", "Bexiga",
				"Bife", "Bigode", "Boca", "Bobo", "Caf�", "Bode", "Cafun�",
				"Canela", "Coxa", "Canudo", "Caneta", "Cubo", "Doze", "Domin�",
				"D�vida", "Dama", "D�vida", "Data", "Dedo", "Exame", "Educado",
				"Exemplo", "F�", "�poca", "Farofa", "Fuma�a", "Furo", "Galo",
				"Gama", "Goma", "Gola", "Galinha", "Gorila", "Gula", "Guri",
				"Guru", "H�bito", "Macaco", "Habilidade", "H�lito", "Hino",
				"Hipop�tamo", "�dolo", "Idade", "Imagem", "Imigrante",
				"Iluminado", "Janela", "Jaleco", "Jabuti", "Jab�", "Javali",
				"Jipe", "Jil�", "Jud�", "L�mina", "L�", "Laje", "Leve", "Lima",
				"Lupa", "Luto", "Mala", "Luva", "Maluco", "Moleza", "Menina",
				"Menino", "Mudo", "Nada", "Natureza", "N�tido", "Novela",
				"Pato", "Pipa", "Opaco", "Pepino", "Perigo", "Peteca",
				"Pomada", "Tomate", "Puma", "R�pido", "Saco", "Sacola", "Rolo",
				"Sede", "S�bado", "Sopa", "Copo", "Sujo", "Subida", "Suco",
				"Tela", "Tubo", "Urina", "Universo", "�nico", "Unidade",
				"Vaca", "Urubu", "Vaso", "Vara", "Vizinho", "Vela", "X�cara",
				"Xaveco", "Xarope", "Xerife", "X�cara", "Zero", "Dica", "Le�o",
				"Tigre", "On�a", "Azul", "Roxo" };

		for (String a : lista) {
			hash.adicionar(a);
		}
		System.out.println("###Buscar o primeiro da lista###");
		System.out.println("O elemento Bobo existe: " + hash.buscar("Bobo"));
		
		System.out.println("\n###Buscar o ultimo da lista, sem ser o primeiro###");
		System.out.println("O elemento Copo existe: " + hash.buscar("Copo"));
		
		System.out.println("\n###Buscar um elemento que nunca foi inserido###");
		System.out.println("O elemento Panela existe: " + hash.buscar("Panela"));
		
		System.out.println("\n###Buscar elemento inserido e removido###");
		System.out.println("O elemento Tela existe: " + hash.buscar("Tela"));
		hash.remove("Tela");
		System.out.println("O elemento Tela existe: " + hash.buscar("Tela"));
		
		System.out.println("\n###Remover todos os elementos de uma posi��ao e inserir novamente###");
		hash.imprimirPosicaoTabela("Exemplo");
		hash.remove("Exemplo");
		hash.remove("H�bito");
		hash.remove("Idade");
		hash.remove("Universo");
		
		System.out.println("\n###Apos apagar elementos###");
		hash.imprimirPosicaoTabela("Exemplo");
		
		System.out.println("\n###Apos inserir novamente###");
		hash.adicionar("Exemplo");
		hash.adicionar("H�bito");
		hash.adicionar("Idade");
		hash.adicionar("Universo");
		hash.imprimirPosicaoTabela("Exemplo");
		
	}
}
