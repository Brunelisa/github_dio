package br.com.bruna.exercicios.array;

import java.util.Random;

public class Sucessor {
	public static void main(String[] args) {
		//armazenando números e mostrando seus sucessores
		
		Random random = new Random(); //gera números aleatórios
		int[] numAleatorio = new int[20];
		
		for(int i = 0; i < numAleatorio.length; i++) {
			int num = random.nextInt(100);
			numAleatorio[i] = num;
			
			
		}
		
		System.out.println("Números aleatórios: ");
		for (int i : numAleatorio) {
			System.out.println(i);
			
			System.out.println("Sucessor: " + (i + 1));
			System.out.println("Antecessor: " + (i - 1));
			
		}
		
	}
}
