package desafio_12_3_estrutura_de_dados;


import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int caso, contador = 0;
		String cliente;
		
		System.out.println("*******************************************************\r\n"
				+ "\r\n"
				+ "            1 - Adicionar Livro na pilha\r\n"
				+ "            2 - Listar todos os Livros\r\n"
				+ "            3 - Retirar Livro da pilha\r\n"
				+ "            0 - Sair\r\n"
				+ "\r\n"
				+ "*******************************************************\r\n");
		
		while (contador == 0) {
			
			System.out.println("Entre com a opção desejada");
			caso = leia.nextInt();
			leia.nextLine();
			switch(caso) {
			
			case 1:
				
				System.out.println("Digite o nome: ");
				cliente = leia.nextLine();
				pilha.push(cliente);
				System.out.println("Livro Adicionado!");
				
				break;
				
			case 2:
				
				System.out.println(pilha);
				
				break;
				
			case 3:
				
				if(pilha.isEmpty()==false) {
	                System.out.println("O cliente: " + pilha.pop() + " foi retirado da fila:  ");}
	                else {
	                    System.out.println("A pilha está vazia! ");
	                }
				
				break;
				
			case 0:
				
				System.out.println("Programa Finalizado!");
				contador++;
				
				break;
				
			default:
			
				break;
			}
		}

	}

}
