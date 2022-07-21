package br.com.bruna.exercicios.array;

public class Inverso {
	public static void main(String[] args) {
		//criando vetor de 6 números e mostrando a ordem inversa
		
		int [] vet = {0, 2, 5, 6, 5, 8}; //criação do vetor
		
		
		
		for(int i = vet.length -1; i >=0; i--) {
			System.out.println(vet[i] + " ");
		}
	}
}
