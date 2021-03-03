package algoritimos2.cap1;

public class buscaBinariaRecursiva {
	public static void main(String[] args) {
		int v[] = { 3, 7, 8, 11, 14, 18, 21, 25 };
		int p = buscaBrecursiva(14, v, 0, v.length);
		System.out.println("Posição: " + p);

	}

	public static int buscaBrecursiva(int x, int[] v, int i, int f) {
		if (i > f) {
			return -1;
		}
		int m = (i + f) / 2;
		if (v[m] == x) {
			return m;
		}
		if (x < v[m]) {
			return buscaBrecursiva(x, v, i, m - 1);
		} else {
			return buscaBrecursiva(x, v, m + 1, f);
		}
	}
}
