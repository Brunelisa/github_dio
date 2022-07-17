package exercise2_dio;

public class Quadrilatero {
	/*iremos utilizar a sobrecarga, para utilizarmos um método somente porém com diferentes
	parâmetros
	
	a sobrecarga só é feita quando os tipos ou quantidade de tipos são diferentes
	
	*/
	
	public static void area(double lado) {
		System.out.println("Área do quadrado = " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("Área do retângulo = " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio = " + ((baseMaior+baseMenor) * altura) / 2);
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Área do losango = " + (diagonal1 * diagonal2) / 2);
	}
}
