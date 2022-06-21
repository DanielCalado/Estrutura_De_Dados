package Ordenacao;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class bubblesort {

	public void bubbleSort(int[] array){
		int cont = 0;
		for (int i = 1; i <= array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int variavel = array[j];
					array[j] = array[j + 1];
					array[j + 1] = variavel;
					cont++;
				}
			}
			if (cont == 0) {
				break;
			} else {
				cont = 0;
			}
		}
	}
}
