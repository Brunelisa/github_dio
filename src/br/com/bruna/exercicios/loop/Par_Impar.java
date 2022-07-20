package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 0;
		int par = 0;
		int impar = 0;
		int qnt;
		
		System.out.println("Insira a quantidade desejada: ");
		qnt = sc.nextInt();
		
		System.out.println("Insira os números: ");
		
		do {
			num = sc.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
			cont++;
			
		}while(cont < qnt);
		
		System.out.println("Quantidade de numeros pares: " + par + "\n Quantidade de numeros impares: " + impar);

	}
	

}
