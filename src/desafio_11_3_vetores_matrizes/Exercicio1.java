package desafio_11_3_vetores_matrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, contador = 0;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for (contador = 0; contador < vetorInteiros.length; contador++) {
			if(vetorInteiros[contador] == num) {
				System.out.println("O número " + num + " está localizado na posição: " + contador);
			}	
			
		}if(num > 10) {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		
	}

}
