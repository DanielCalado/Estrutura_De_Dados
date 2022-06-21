package Ordenacao;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int[] v, int[] w, int inicio, int fim){
		if(inicio < fim){
			int meio = (inicio + fim) / 2;
			mergeSort(v, w, inicio, meio);
			mergeSort(v, w, meio+1, fim);
			intercalar(v, w, inicio, meio, fim);
		}
	}
	private static void intercalar(int[] v, int[] w, int inicio, int meio, int fim){
		for(int i = inicio; i <= fim; i++){
			w[i] = v[i];
		}
		int i = inicio;
		int m = meio + 1;
		
		for(int k = inicio; k <= fim; k++){
			if(i > meio){
				v[k] = w[m++];
			}else if(m > fim){
				v[k] = w[i++];
			}else if(w[i] < w[m]){
				v[k] = w[i++];
			}else{
				v[k] = w[m++];			}
		}
	}
}
