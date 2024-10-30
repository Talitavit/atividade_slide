package exercicio2;

import java.util.Scanner;

public class CalcularMetabolismo {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu gênero, M masculino F feminino: ");
		char genero = scanner.next().toUpperCase().charAt(0);
		
		System.out.println("Digite sua idade em anos: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu peso em kg: ");
		double peso = scanner.nextDouble();
		
		double metabolismo = 0; 
		
		
	     if (genero != 'M' && genero != 'F') {
	            System.out.println("Gênero inválido.");
	            return;
	            
	        } else if (genero == 'M') { 
	            if (idade >= 18 && idade <= 30) {
	                metabolismo = 15.057 * peso + 679;
	            } else if (idade > 30 && idade <= 60) {
	                metabolismo = 11.6 * peso + 879;
	            } else if (idade > 60) {
	                metabolismo = 13.5 * peso + 487;
	            }
	        } else { 
	            if (idade >= 18 && idade <= 30) {
	                metabolismo = 14.7 * peso + 486.6;
	            } else if (idade > 30 && idade <= 60) {
	                metabolismo = 8.7 * peso + 829;
	            } else if (idade > 60) {
	                metabolismo = 10.5 * peso + 596;
	            }
	        }

	       
	        System.out.printf("Seu metabolismo basal é: %.2f Kcal%n", metabolismo);

	        scanner.close();
	}
}
