/* converter numero decimal para binario*/

package algoritimos2.cap4;

public class RecursividadeBinario {

	public static void main(String[] args) {
		binario(13);
		System.out.println(); 

	}

	public static void binario(int n) {
		if (n < 2) {
			System.out.print(n);
		} else {
			binario(n / 2);
			System.out.print(n % 2);
		}
	}
}
