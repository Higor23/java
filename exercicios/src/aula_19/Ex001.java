package aula_19;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		
		for(int i = 0; i< vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorB[i];
		}
		 System.out.print("Vetor A = ");
		 for (int i=0; i<vetorA.length; i++) {
			 System.out.print(vetorA[i] + " ");
		 }

	}

}
