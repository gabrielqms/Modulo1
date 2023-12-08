package desafio_10_2_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0, positivo = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				positivo += num;
			}
		} while (num !=0);
		System.out.println("A soma dos números positivos digitados é: "+ positivo);

	}

}
