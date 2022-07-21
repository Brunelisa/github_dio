package br.com.bruna.exercicios.array;

import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		//imprimindo valores aleatorios com matriz
		
		Random random = new Random();
		
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < matriz.length; i++) { //linha
			for(int j = 0; j < matriz[i].length; j++) { //coluna, j tem que ser menor que o tamanho da linha que esta percorrendo, irá percorrer as colunas
				matriz[i][j] = random.nextInt(9); //preenchendo com os números
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : matriz) {
			for (int coluna : linha) { //coluna dentro da linha
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}
}
