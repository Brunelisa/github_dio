package br.com.bruna.exercicios.loop;

import java.util.Scanner;

public class Nome_Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		
		
		while(true) {
			System.out.println("Insira seu nome: ");
			nome = sc.next();
			
			if(nome.equals("0")) {
				break;
			}
			

			System.out.println("Insira sua idade: ");
			idade = sc.nextInt();
			
			System.out.println("Nome e idade : " + nome + " e " + idade);
		}
		
		sc.close();
	}

}
