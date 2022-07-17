package exercise2_dio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Imprimindo as áreas");
		double areaQuad = Quadrilatero.area(4);
		System.out.println("Área quadrado: " + areaQuad);
		
		
		double areaRet = Quadrilatero.area(4d, 3d); //foi passado o d para representar o double e não haver confusão de métodos
		System.out.println("Área retângulo: " + areaRet);
		
		double areaTrap = Quadrilatero.area(7, 8, 9);
		System.out.println("Área trapézio: " + areaTrap);
		
		
		float areaLos = Quadrilatero.area(4f, 5f); //foi passado o f para representar o float e não haver confusão de métodos
		System.out.println("Área losango: " + areaLos);
		
		//percebe-se que para pegar o retorno correto, basta inserir a quantidade de parâmetros que o método que você quer tem
		//obs: quando o método é void, conseguimos chamar ele sem um sysout, quando ele tem um retorno, chamamos ele através do sysout

	}

}
