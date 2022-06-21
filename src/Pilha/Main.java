package Pilha;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pilha teste = new Pilha();

		String frase = ler.next();

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			if (caractere == '(') {
				teste.push(String.valueOf(caractere));
			}
			if (caractere == ')') {
				if (teste.pop() == null) {
					System.out.println("Invalida");
					break;
				}
			}
			if (frase.length() == i + 1) {
				if (!teste.isEmpty()) {
					System.out.println("Invalida");
				} else {
					System.out.println("Valida");
				}
			}

		}

	}
}