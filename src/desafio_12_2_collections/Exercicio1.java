package desafio_12_2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cores2;
		
		System.out.println("Digite 5 cores: ");
		for(int contador = 1; contador < 6; contador++) {
			cores2 = leia.nextLine();
			cores.add(cores2);
		}
		System.out.println("\nListar todas as cores: \n");
		for(String c : cores) {
			System.out.println(c);
		}
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: \n");
		for(int contador = 0; contador <cores.size(); contador++) {
			System.out.println(cores.get(contador));
		}
	}

}
