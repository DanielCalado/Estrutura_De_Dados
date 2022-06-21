package Ordenacao;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		int[] cinquentaMil = new int[50000];
		int[] cemMil = new int[100000];
		int[] duzentosMil = new int[200000];
		bubblesort bubblesort = new bubblesort();
		MergeSort mergesort = new MergeSort();
		QuickSort quicksort = new QuickSort();

		for (int i = 0; i < cinquentaMil.length; i++) {
			cinquentaMil[i] = (int) (Math.random() * cinquentaMil.length);
		}

		for (int i = 0; i < cemMil.length; i++) {
			cemMil[i] = (int) (Math.random() * cemMil.length);
		}

		for (int i = 0; i < duzentosMil.length; i++) {
			duzentosMil[i] = (int) (Math.random() * duzentosMil.length);
		}
		
		//int[] arrayNovo = new int[cinquentaMil.length];
		//mergesort.mergeSort(cinquentaMil, arrayNovo, 0, cinquentaMil.length - 1);
		//System.out.println(Arrays.toString(cinquentaMil));
		quicksort.quickSort(cinquentaMil, 0, cinquentaMil.length - 1);
		System.out.println(Arrays.toString(cinquentaMil));
		long tempoFinal = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss SSSSS");
		System.out.println(tempoFinal - tempoInicial);

	}

}
