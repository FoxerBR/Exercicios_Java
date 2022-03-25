package exercicio04;

import java.util.Scanner;

//Ler quatro valores num�ricos inteiros e apresentar o resultado dois a dois da adi��o e multiplica��o entre os 
//valores lidos, baseando-se na utiliza��o do conceito de propriedade distributiva. Dica: se forem lidas as vari�veis 
//A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B 
//com D e por �ltimo C com D. Note que para cada opera��o ser�o utilizadas seis combina��es. Assim sendo, 
//devem ser realizadas doze opera��es de processamento, sendo seis para as adi��es e seis para as 
//multiplica��es. 

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int b = sc.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		int c = sc.nextInt();
		System.out.print("Informe o quarto n�mero: ");
		int d = sc.nextInt();
		
		int res1 = a + b;
		int res2 = a + c;
		int res3 = a + d;
		int res4 = b + c;
		int res5 = b + d;
		int res6 = c + d;
		
		int res7 = a * b;
		int res8 = a * c;
		int res9 = a * d;
		int res10 = b * c;
		int res11 = b * d;
		int res12 = c * d;
		
		System.out.println();
		System.out.println("=========== Resultados ============");
		System.out.println("============= Adi��o ==============");
		System.out.println( a +" + "+ b + " = " + res1 +" |||||| " + a + " + " + c + " = " + res2);
		System.out.println( a +" + "+ d + " = " + res3 +" |||||| " + b + " + " + c + " = " + res4);
		System.out.println( b +" + "+ d + " = " + res5 +" |||||| " + c + " + " + d + " = " + res6);
		System.out.println();
		System.out.println("========== Multiplica��0 ==========");
		System.out.println( a +" x "+ b + " = " + res7 +" |||||| " + a + " x " + c + " = " + res8);
		System.out.println( a +" x "+ d + " = " + res9 +" |||||| " + b + " x " + c + " = " + res10);
		System.out.println( b +" x "+ d + " = " + res11 +" |||||| " + c + " x " + d + " = " + res12);
		
		sc.close();
	}

}
