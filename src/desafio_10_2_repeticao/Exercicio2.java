package desafio_10_2_repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, par = 0, impar = 0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println("Digite o " + i + " número ");
			n = leia.nextInt();
			
			if (n % 2 == 0) {
				par++;
			}
			if (n % 2 == 1) {
				impar++;
			}
			
		}
		
		System.out.println("Total de números pares: " + par );
		System.out.println("Total de números ímpares: " + impar );
		
	}

}
