package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
 
		int codigoProd = sc.nextInt();
		int qtdProd = sc.nextInt();
		double valorProd = 0;

		switch (codigoProd) {

		case 1:
			valorProd = 4.00;
			break;
		case 2:
			valorProd = 4.50;
			break;
		case 3:
			valorProd = 5.00;
			break;
		case 4:
			valorProd = 2.00;
			break;
		case 5:
			valorProd = 1.50;

		}
		
		double total = valorProd * qtdProd;
		
		System.out.printf("Total: R$ %.2f%n", total);
		

		sc.close();
	}

}
