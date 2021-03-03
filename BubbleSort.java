/*ordenação por trocas - comparação com a proxima posição
%s - String de caracteres
%d - Número inteiro decimal*/

package algoritimos2.cap3;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int v[] = {32, 17, 51, 8, 23};
		System.out.printf("Inicio -> %s \n", Arrays.toString(v));
		bubbleSort(v);
		System.out.printf("Fim -> %s \n", Arrays.toString(v));
	}
	public static void bubbleSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				if (v[j] > v[j+1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j+1] =  aux;
				}
			}
			System.out.printf("Passagen %d -> %s \n", 
					i, Arrays.toString(v));
		}
	}
}
