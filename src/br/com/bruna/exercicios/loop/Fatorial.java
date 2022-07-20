package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int i;
		int fatorial = 1;
		
		System.out.println("Insira um número: ");
		num = sc.nextInt();
		
		for(i = num; i >= 1 ; i--) {
			fatorial = fatorial * i;
		}

		System.out.println(num + "! = " + fatorial );
	}

}
