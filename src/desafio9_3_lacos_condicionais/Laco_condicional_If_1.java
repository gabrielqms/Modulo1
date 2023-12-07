package desafio9_3_lacos_condicionais;

import java.util.Scanner;

public class Laco_condicional_If_1 {

	public static void main(String[] args) {
		int A, B, C, resultado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		C = leia.nextInt();

		resultado = A + B;
		
		if(resultado == C) {
			System.out.println(A+ " + " +B +" = " +resultado+ " = "+ C );
			System.out.println("A Soma de A + B é Igual a C");
		}else if(resultado > C) {
			System.out.println(A+ " + " +B +" = " +resultado+ " > "+ C );
			System.out.println("A Soma de A + B é Maior do que C");
		}else {
			System.out.println(A+ " + " +B +" = " +resultado+ " < "+ C );
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
	}

}
