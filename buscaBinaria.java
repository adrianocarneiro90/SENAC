//vetor deve estar ORDENADO, busca mais rapida

package algoritimos2.cap1;

import java.util.Arrays;
import java.util.Scanner;

public class buscaBinaria {
	public static void main(String[] args) {
		int v[] = { 7, 3, 4, 5, 6, 2 };
		Arrays.sort(v);
		imprimir(v);
		Scanner leitor = new Scanner(System.in);
		System.out.print("Valor: ");
		int valor = leitor.nextInt();
		int pos = bBinaria(v, valor);
		if (pos >= 0) {
			System.out.println("Valor encontrado na posição: " + pos);
		} else {
			System.out.println("Valor nao encontrado");
		}
	}

	public static int bBinaria(int[] v, int x) {
		int i = 0;
		int f = v.length - 1;
		int m;
		while (i <= f) {
			m = (i + f) / 2;
			if (v[m] == x) {
				return m;
			}
			if (x < v[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}
		return -1;
	}

	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
}
