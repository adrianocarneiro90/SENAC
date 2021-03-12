/* FIFO (First in First Out), primeiro elemento que entrar é o ultimo a sair*/

package algoritimos2.cap5;

import java.util.Arrays;

public class Fila {
	// Atributos
	private int[] dados;
	private int capacidade;
	private int fim;
	
	// Construtores
	public Fila (int capacidade) {
		this.capacidade = capacidade;
		this.dados = new int [this.capacidade];
		this.fim = 0;
	}
	
	// Metodos
	public int primeiro() {
		return this.dados[0];
	}
	
	public boolean ehVazia() {
		return this.fim == 0;
	}
	
	public int tamanho() {
		return this.fim;
	}
	
	public void enfileira(int numero) {
		if ((this.fim + 1) > this.capacidade) {
			throw new RuntimeException("A fila está com capacidade maxiam!");
			}
		this.dados[this.fim] = numero;
		this.fim++;
	}
	
	public int desenfileira() {
		if (ehVazia()) {
			throw new RuntimeException("A fila está vazia.");
		}
		int numero = this.dados[0];
		for(int i = 0; i < this.fim - 1; i++) {
			this.dados[i] = this.dados[i + 1];
		}
		this.fim--;
		return numero;
	}
	
	public String toString() {
		String s = " [";
		for (int i = 0; i < fim; i++) {
			s += dados[i];
			if (i + 1 < fim) {
				s += ", ";
			}
		}
		s += "]";
		return s;
	}	
}
