/* percorre o vetor inserindo ordenamamente na esquerda
 do fim (ja ordenado ordenado) par ao início*/

package algoritimos2.cap3;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int v[] = {32, 17, 51, 8, 23};
		System.out.printf("Inicio -> %s \n", Arrays.toString(v));
		insertionSort(v);
		System.out.printf("Fim -> %s \n", Arrays.toString(v));

	}
	public static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int x = v[i];
			for (int j = i - 1; j >= 0 && v[j] > x; j--) {
				v[j + 1] = v[j];
				v[j] = x;
			}
			System.out.printf("Passagen %d -> %s \n", 
					i, Arrays.toString(v));
		}
	}
}
