package br.com.bruna.exercicios.array;

import java.util.Scanner;

public class Consoante {
	 public static void main(String[] args) {
		//construindo um programa que imprime as consoantes de um vetor
		 
		Scanner sc = new Scanner(System.in);
		
		String[] palavra = new String[6];
		int consoantes = 0;
		int cont = 0;
		
		do {
			System.out.println("Letra: ");
			String letra = sc.next();
			
			//equalsIgnoreCase compara as strings independente de ser maiuscula ou minuscula
			if(!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))){
				palavra[cont] = letra;
				consoantes++;
			}
			
			cont++;
			
		}while(cont < palavra.length); //enquanto contador for menor que o tamanho do vetor
		
		System.out.println("Consoantes: ");
		for (String cons : palavra) {
			if(cons != null) //para não imprimir o null nas posições que estiver com vogal
			System.out.println(cons);
		}
		
		System.out.println("Quantidade de consoantes: " + consoantes);
	}
}
