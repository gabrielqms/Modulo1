package desafio9_3_lacos_condicionais;

import java.util.Scanner;

public class Laco_condicional_If_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String palavra1, palavra2, palavra3;
		
		
		System.out.println("Digite sua primeira palavra");
		palavra1 = leia.nextLine();
		
		System.out.println("Digite sua segunda palavra");
		palavra2 = leia.nextLine();
		
		System.out.println("Digite sua terceira palavra");
		palavra3 = leia.nextLine();
		
		if(palavra1.equals("vertebrado")  ) {
			if(palavra2.equals("ave") ) {
				if(palavra3.equals("carnívoro") ) {
					System.out.println("águia");
					
				}else {
					System.out.println("pomba");
				}
			}else {
				if(palavra3.equals("onívoro") ) {
					System.out.println("homem");
				}else {
					System.out.println("vaca");
				}
			}
		}else {
			if(palavra2.equals("inseto")  ) {
				if(palavra3.equals("hematófago") ) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			} if(palavra2.equals("hematófago") ) {
				System.out.println("Sanguessuga");
			}else {
				System.out.println("minhoca");
			}
		}
		
		
	}

}
