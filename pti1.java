package algoritimos2.cap1;

import java.util.Scanner;

public class pti1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Quantidade elementos: ");
		int v[] = new int[leitor.nextInt()];
		for (int i = 0; i < v.length; i++) {
			System.out.print("Vetor[" + i + "] = ");
			v[i] = leitor.nextInt();
		}
		System.out.println("");
		System.out.println("Calcule a diferença entre 2 vetores:");
		System.out.print("Vetor []: ");
		int x = leitor.nextInt();
		System.out.print("Vetor []: ");
		int y = leitor.nextInt();

		// calcular a diferença entre os valores digitados pelo usuário
		valorDiferenca(v[x], v[y]);
		System.out.println("");

		// verificar se o vetor esta em ordem crescente
		System.out.println("O vetor esta em ordem crescente?");
		System.out.println(ordemCrescente(v));

	}

	public static void valorDiferenca(int x, int y) {
		int dif = 0;
		if (x > y) {
			dif = x - y;
		} else {
			dif = y - x;
		}
		System.out.println("Diferença: " + dif);
	}

	public static boolean ordemCrescente(int[] v) {
		boolean ordem = true;
		for (int i = 1; i < v.length; i++) {
			if (v[i - 1] > v[i]) {
				ordem = false;
			}
		}
		return ordem;
	}
}
