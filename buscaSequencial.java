package algoritimos2.cap1;

import java.util.Scanner;

public class buscaSequencial {
	public static void main(String[] args) {
		// declara vetor
		int v1[] = { 7, 3, 4, 5, 6, 2 };
		imprimir(v1);

		// buscar dado
		Scanner leitor = new Scanner(System.in);
		System.out.print("Valor: ");
		int valor = leitor.nextInt();
		int pos = bSequencial(v1, valor);
		if (pos >= 0) {
			System.out.println("Valor encontrado na posição:  " + pos);
		} else {
			System.out.println("Valor nao encontrado.");
		}
	}

	public static int bSequencial(int[] v, int x) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// função para imprimir
	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
}
