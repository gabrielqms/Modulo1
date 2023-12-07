package desafio9_3_lacos_condicionais;

import java.util.Scanner;

public class Laco_condicional_Switch_5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int produto, quantidade;
		
		System.out.println("Digite o codigo do produto: ");
		System.out.println("1 - Cachorro Quente (R$10,00)");
		System.out.println("2 - X-Salada (R$15,00)");
		System.out.println("3 - X-Bacon (R$18,00)");
		System.out.println("4 - Bauru (R$12,00)");
		System.out.println("5 - Refrigerante (R$8,00)");
		System.out.println("6 - Suco de laranja (R$13,00)");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(produto) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total da compra: " + quantidade * 10.00);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total da compra: " + quantidade * 15.00);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total da compra: " + quantidade * 18.00);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total da compra: " + quantidade * 12.00);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total da compra: " + quantidade * 8.00);
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total da compra: " + quantidade * 13.00);
			break;
			default:
				System.out.println("Opção invalida");
		}
		
	}

}
