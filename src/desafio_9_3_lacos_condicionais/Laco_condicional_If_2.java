package desafio_9_3_lacos_condicionais;

import java.util.Scanner;

public class Laco_condicional_If_2 {

	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero >= 0 && numero % 2 == 0) {
			System.out.println("O Número " +numero+ " é par e positivo!" );
		}else if(numero < 0 && numero % 2 == 0 ) {
			System.out.println("O Número " +numero+ " é par e negativo!");
		}else if(numero > 0 && numero % 2 == 1) {
			System.out.println("O Número " +numero+ " é ímpar e positivo!");
		}else {
			System.out.println("O Número " +numero+ " é ímpar e negativo!");
		}

	}

}
