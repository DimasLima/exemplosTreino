package exemplo;

import java.util.Locale;
import java.util.Scanner;

import classes.Produtos;

public class Exemplo2 {

	public static void main(String[] args) {
		
		double soma = 0, media = 0;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.printf("Insira quantidade de produtos: ");
		int n = scan.nextInt();
		
		Produtos[] vet = new Produtos[n];
		
		for(int i = 0; i<vet.length;i++) {
			
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			vet[i] = new Produtos(name, price);
		}
		
		for(int i = 0; i<n;i++) {
			soma = soma + vet[i].getPrice();
		}
		media = soma/n;
		
		System.out.printf("Media dos preços = " + media);

	}

}
