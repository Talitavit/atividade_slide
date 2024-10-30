package exercicio1;

import java.util.Scanner;

public class CalcularImc {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu peso em kg: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite sual altura em metros: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		String classificacao;
		
		if (imc < 19) {
			classificacao = "Abaixo do peso";
		} else if (imc < 25 ){
			classificacao = "Peso normal";
		} else if (imc < 30) {
			classificacao = "Sobrepeso";
		} else if (imc <40 ){
			classificacao = "Obesidade tipo 1";
		} else {
			classificacao = "Obesidade mórbida";
		}
		
		
		System.out.printf("Seu IMC é: %.2f - %s\n", imc, classificacao);
		
		scanner.close();
		
	}

}
