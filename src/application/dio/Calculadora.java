package application.dio;

public class Calculadora {
		/*criação de métodos para cálculo

		static = classe não precisa ser instanciada para chamar este método.
		
		
		void = não tem retorno*/
		public static void soma(double n1, double n2) {
			double total = n1 + n2;
			
			System.out.println("Soma = " + total);
		}

		public static void subtracao(double n1, double n2) {
			double total = n1 - n2;
			
			System.out.println("Subtração = " + total);
		}
		
		public static void divisao(double n1, double n2) {
			double total = n1/n2;
			
			System.out.println("Divisão = " + total);
		}
		
		public static void multi(double n1, double n2) {
			double total = n1*n2;
			
			System.out.println("Multiplicação = " + total);
		}

}
