package desafio_12_2_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set <Integer> setInt = new HashSet<Integer>();
		
		System.out.println("Digite 10 números: ");
		for(int i = 0; i < 10; i++) {
			int numero = leia.nextInt();
			setInt.add(numero);
		}
		System.out.println("Listar dados do Set: ");
		Iterator<Integer> iterator = setInt.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}

}

