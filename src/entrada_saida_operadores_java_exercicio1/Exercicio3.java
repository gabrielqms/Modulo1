package entrada_saida_operadores_java_exercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		float salarioBruto;
		
		System.out.println("Salário Bruto: ");
		salarioBruto = scan1.nextFloat();
		
		Scanner scan2 = new Scanner(System.in);
		float adicionalNoturno;
		
		System.out.println("Adicional Noturno: ");
		adicionalNoturno = scan2.nextFloat();
		
		Scanner scan3 = new Scanner(System.in);
		float horasExtras;
		
		System.out.println("Horas Extras: ");
		horasExtras = scan3.nextFloat();
		
		Scanner scan4 = new Scanner(System.in);
		float descontos;
		
		System.out.println("Descontos: ");
		descontos = scan4.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("Salário Liquido: %.2f",salarioLiquido);
	}

}
