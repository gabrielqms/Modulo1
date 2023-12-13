package desafio_12_3_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int caso, contador = 0;
		String cliente;
		
		System.out.println("*******************************************************\r\n"
				+ "\r\n"
				+ "            1 - Adicionar Cliente na Fila\r\n"
				+ "            2 - Listar todos os Clientes\r\n"
				+ "            3 - Retirar Cliente da Fila\r\n"
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
				cliente = leia.next();
				fila.add(cliente);
				System.out.println("Cliente Adicionado!");
				
				break;
				
			case 2:
				
				System.out.println(fila);
				
				break;
				
			case 3:
				
				if(fila.isEmpty()==false) {
	                System.out.println("O cliente: " + fila.poll() + " foi retirado da fila:  ");}
	                else {
	                    System.out.println("A Fila está vazia! ");
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
