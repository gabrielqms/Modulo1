package entrada_saida_operadores_java_exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		float salario; 
		
		System.out.println("Digite o Salário: ");
		salario = scan.nextFloat();
		
		Scanner scan1 = new Scanner(System.in);
		float abono;
		
		System.out.println("Digite o Abono: ");
		abono = scan1.nextFloat();
		
		float novosalario = salario + abono;
		System.out.printf("Novo Salário: %.2f",novosalario);
		
		
	}

}
