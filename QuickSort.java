/* Arrays.sort é baseado no quicksort - igual ao mergesort tambem é divisão e conquista*/

package algoritimos2.cap4;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int X[] = {29, 10, 36, 18, 83, 42, 8, 20};
		sort(X, 0, X.length - 1);
		System.out.printf("Ordenado: %s \n", Arrays.toString(X));
	}
	public static void sort(int X[], int inicio, int fim) { 
	    if (inicio < fim) {
	      int pivot = divide(X, inicio, fim); 
	      sort(X, inicio, pivot - 1); 
	      sort(X, pivot + 1, fim); 
	    } 
	  } 
	 
	   public static int divide(int X[], int inicio, int fim) { 
	    int pivot = X[inicio]; 
	    int postPivot = inicio; 
	    for (int i = inicio + 1; i <= fim; i++) { 
	      if(X[i] < pivot) { 
	        X[postPivot] = X[i]; 
	        X[i] = X[postPivot + 1]; 
	        postPivot++; 
	      } 
	    } 
	    X[postPivot] = pivot; 
	    return postPivot; 
	}
}
