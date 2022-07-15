package application.dio;

public class Emprestimo {
	
	public static void calc_emprestimo (double val, int num_parcelas) {
		int val_taxa;
		
		if(num_parcelas >= 1 && num_parcelas <= 4) {
			val_taxa = 0;
			
			System.out.println("Valor total: " + val * val_taxa);
			
		}else if(num_parcelas <= 7) {
			val_taxa = 2;
			
			System.out.println("Valor total: " + val * val_taxa);
		}
		else if(num_parcelas <= 14) {
			val_taxa = 4;
			
			System.out.println("Valor total: " + val * val_taxa);
		}
		else if(num_parcelas >= 15) {
			val_taxa = 8;
			
			System.out.println("Valor total: " + val * val_taxa);
		}
		
	}
	
	
}
