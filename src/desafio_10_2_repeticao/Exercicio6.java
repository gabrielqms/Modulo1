package desafio_10_2_repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if(num != 0 && num % 3 == 0) {
				soma += num;
				contador++;
			}
			
		} while (num != 0);
		
		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		}
		}

	}

