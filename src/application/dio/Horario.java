package application.dio;

public class Horario {
	
	public static void hora(int hora) {
		if(hora >= 1 && hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora < 18) {
			System.out.println("Boa tarde!");
		}else if(hora <= 24) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Formato de hora inválido!");
		}
	}
}
