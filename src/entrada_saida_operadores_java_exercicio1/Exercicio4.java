package entrada_saida_operadores_java_exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		float n1;
		
		System.out.println("numero1: ");
		n1 = scan1.nextFloat();
		
		Scanner scan2 = new Scanner(System.in);
		float n2;
		
		System.out.println("numero2: ");
		n2 = scan2.nextFloat();
		
		Scanner scan3 = new Scanner(System.in);
		float n3;
		
		System.out.println("numero3: ");
		n3 = scan3.nextFloat();
		
		Scanner scan4 = new Scanner(System.in);
		float n4;
		
		System.out.println("numero4: ");
		n4 = scan4.nextFloat();
		
		float diferenca = (n1*n2) - (n3*n4);
		System.out.printf("Diferença: %.1f",diferenca);
	}

}
