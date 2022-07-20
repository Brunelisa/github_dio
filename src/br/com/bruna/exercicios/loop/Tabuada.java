package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i;
		
		
		System.out.println("Digite o número desejado para a tabuada: ");
		num = sc.nextInt();
		
		for(i = 0; i <= 10; i++) {

			System.out.println(num + " X " + i + " = " + (num * i));
			
		}
		

	}

}
