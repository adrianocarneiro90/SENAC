package algoritimos2.cap1;

import java.util.Scanner;

class busca {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int v[] = new int[6];
		for (int i = 0; i < v.length; i++) {
			System.out.print("Vetor[" + i + "] = ");
			v[i] = leitor.nextInt();
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
}
