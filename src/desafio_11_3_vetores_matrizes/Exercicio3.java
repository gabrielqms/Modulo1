package desafio_11_3_vetores_matrizes;

public class Exercicio3 {

	public static void main(String[] args) {
		int dp = 0, pd = 0;
		int matriz [][] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println("Elementos da Diagonal Principal: " + matriz [0][0] + " " + matriz [1][1] + " " + matriz[2][2]);
		
		System.out.println("Elementos da Diagonal Secundária: " + matriz [0][2] + " " + matriz [1][1] + " " + matriz[2][0]);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if (i==j) {
					dp = dp + matriz[i][j];
				}
			}
		
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + dp);
		
		for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
		    pd += matriz[i][j];
		}
		
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + pd);
				
	}

}
