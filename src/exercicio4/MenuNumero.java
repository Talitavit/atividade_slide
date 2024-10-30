package exercicio4;

import java.util.Scanner;

public class MenuNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Calcular Metabolismo Basal");
            System.out.println("3 - Verificar se número é par ou ímpar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularImc(scanner);
                    break;
                case 2:
                    calcularMetabolismo(scanner);
                    break;
                case 3:
                    verificarParOuImpar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close(); 
    }

    public static void calcularImc(Scanner scanner) {
        System.out.println("Digite seu nome:");
        scanner.nextLine(); 
        String nome = scanner.nextLine();

        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 19) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 40) {
            classificacao = "Obesidade tipo 1";
        } else {
            classificacao = "Obesidade mórbida";
        }

        System.out.printf("Seu IMC é: %.2f - %s\n", imc, classificacao);
    }

    public static void calcularMetabolismo(Scanner scanner) {
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
    }

    public static void verificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
    }
}

