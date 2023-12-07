package desafio9_3_lacos_condicionais;

import java.util.Scanner;

public class Laco_condicional_Switch_6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String colaborador;
		int cargo;
		float salario;
		
		System.out.println("Nome do colaborador: ");
		colaborador = leia.nextLine();
		
		System.out.println("Digite seu cargo: ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		cargo = leia.nextInt();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		switch(cargo) {
		case 1:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Gerente");
			System.out.println("Novo Salário: "+ salario * 1.1);
			break;
		case 2:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Vendedor");
			System.out.println("Novo Salário: "+ salario * 1.07);
			break;
		case 3:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Supervisor");
			System.out.println("Novo Salário: "+ salario * 1.09);
			break;
		case 4:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Motorista");
			System.out.println("Novo Salário: "+ salario * 1.06);
			break;
		case 5:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Estoquista");
			System.out.println("Novo Salário: "+ salario * 1.05);
			break;
		case 6:
			System.out.println("Nome do colaborador: " +colaborador);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Novo Salário: "+ salario * 1.08);
			break;
			default:
				System.out.println("Opção invalida");
		}

	}

}
