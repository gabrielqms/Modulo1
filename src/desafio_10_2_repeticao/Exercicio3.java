package desafio_10_2_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pessoas = 0, menores = 0, maiores = 0;
		
		while(pessoas <=10) {
			System.out.println("Digite uma idade: ");
			int i = leia.nextInt();
			
			if(i > 50) {
				maiores++;
				
			}else if(i < 21 && i > 0) {
				menores++;
			}
			pessoas++;
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menores +"\n");
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
		
		}
		

	}


