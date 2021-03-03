/*selecionando/buscando o menor elemento e trazendo para ferente*/

package algoritimos2.cap3;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int v[] = {32, 17, 51, 8, 23};
		System.out.printf("Inicio -> %s \n", Arrays.toString(v));
		selectionSort(v);
		System.out.printf("Fim -> %s \n", Arrays.toString(v));
	}
	public static void selectionSort(int[] v) {
		for(int i = 0; i < v.length; i++) {
			int sindex = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[sindex])
					sindex = j;
			}
			int aux = v[i];
			v[i] = v[sindex];
			v[sindex] = aux;
			System.out.printf("Passagen %d -> %s \n", 
					i, Arrays.toString(v));
		}
	}
}
