package entrada_saida_operadores_java_exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		float nota1;
		
		System.out.println("Digite a nota 1: ");
		nota1 = scan1.nextFloat();
		
		Scanner scan2 = new Scanner(System.in);
		float nota2;
		
		System.out.println("Digite a nota 2: ");
		nota2 = scan2.nextFloat();
		
		Scanner scan3 = new Scanner(System.in);
		float nota3;
		
		System.out.println("Digite a nota 3: ");
		nota3 = scan3.nextFloat();
		
		Scanner scan4 = new Scanner(System.in);
		float nota4;
		
		System.out.println("Digite a nota 4: ");
		nota4 = scan4.nextFloat();
		
		float mediafinal = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.printf("Média final: %.1f",mediafinal);
		
	}

}
