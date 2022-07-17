package exercise2_dio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Imprimindo as áreas");
		//área quadrado
		Quadrilatero.area(4);
		//área retângulo
		Quadrilatero.area(4d, 3d); //foi passado o d para representar o double e não haver confusão de métodos
		//área trapézio
		Quadrilatero.area(7, 8, 9);
		//área losango
		Quadrilatero.area(4f, 5f); //foi passado o f para representar o float e não haver confusão de métodos
		//área trapézio
		
		//percebe-se que para pegar o retorno correto, basta inserir a quantidade de parâmetros que o método que você quer tem
		

	}

}
