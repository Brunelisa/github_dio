package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		int cont = 0;
		double somaNum = 0; 
		double maiorNum = 0;
		
		System.out.println("Insira 5 números: ");
		
		do {
			
			num = sc.nextInt();
			
			if(num > maiorNum) {
				maiorNum = num;
			}
			
			somaNum = somaNum + num;
			
			
			
			cont++;
			
		} while(cont < 5);
		
		System.out.println("Maior numero: "+ maiorNum);
		System.out.println("Média: " + (somaNum/5));

	}

}
