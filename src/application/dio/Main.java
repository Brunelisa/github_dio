package application.dio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//----Exercício calculadora
		
		int n1, n2, hora, parcela;
		double val_emprestimo;
		
		//SOMA
		
		
		System.out.println("Insira dois números para soma: ");
		System.out.println("Número 1: ");
		n1 = sc.nextInt();
		System.out.println("Número 2: ");
		n2 = sc.nextInt();
		
		Calculadora.soma(n1, n2);
		
		//SUBTRAÇÃO
		System.out.println("Insira dois números para subtração: ");
		System.out.println("Número 1: ");
		n1 = sc.nextInt();
		System.out.println("Número 2: ");
		n2 = sc.nextInt();
		
		Calculadora.subtracao(n1, n2);
		
		//DIVISÃO
		System.out.println("Insira dois números para divisão: ");
		System.out.println("Número 1: ");
		n1 = sc.nextInt();
		System.out.println("Número 2: ");
		n2 = sc.nextInt();
		
		Calculadora.divisao(n1, n2);
		
		//MULTIPLICAÇÃO
		System.out.println("Insira dois números para multiplicação: ");
		System.out.println("Número 1: ");
		n1 = sc.nextInt();
		System.out.println("Número 2: ");
		n2 = sc.nextInt();
		
		Calculadora.multi(n1, n2);
		
		//---Exercício horário
		System.out.println("Insira a hora: ");
		hora = sc.nextInt();
		
		Horario.hora(hora);
		
		//---Exercício empréstimo
		System.out.println("Insira o valor que quer contratar: ");
		val_emprestimo = sc.nextDouble();
		System.out.println("Insira o número de parcelas: ");
		parcela = sc.nextInt();
		
		Emprestimo.calc_emprestimo(val_emprestimo, parcela);
		
		sc.close();
	}

}
