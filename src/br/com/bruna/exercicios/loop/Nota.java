package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = 0;
		
		while(true) {
			System.out.println("Insira uma nota de 0 a 10: ");
			nota= sc.nextInt();
			
			if(nota < 0 || nota >10) {
				System.out.println("Valor inválido, insira novamente.");
					
			}else {
				System.out.println("Nota inserida: " + nota);
				break;
			}
		}

	}

}
