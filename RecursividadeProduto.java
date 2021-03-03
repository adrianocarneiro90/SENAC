/*multiplicação de forma recusrsiva*/

package algoritimos2.cap4;

import java.util.Scanner;

public class RecursividadeProduto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Valor A: ");
		int a = leitor.nextInt();
		System.out.print("Valor B: ");
		int b = leitor.nextInt();
		int p = produto(a, b);
		System.out.println("Produto = " + p);

	}

	public static int produto(int a, int b) {
		if (b == 1) {
			return a;
		}
		return produto(a, b - 1) + a;

	}
}
