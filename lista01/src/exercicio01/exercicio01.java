package exercicio01;

import java.util.Scanner;

//Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que: 
//ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2. 

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== Estoque M�dio ======");
		System.out.println("Informe a quantidade m�nima: ");
		int qntMinima = sc.nextInt();
		System.out.println("Informe a quantidade m�xima: ");
		int qntMaxima = sc.nextInt();
		int estMedio = (qntMinima + qntMaxima) / 2;
		System.out.println("Estoque m�dio: "+estMedio);
		
		sc.close();
	}

}