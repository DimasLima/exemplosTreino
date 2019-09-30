package exemplo;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		int n=0;
		double soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		n = scan.nextInt();
		double[] vet = new double[n];
		
		System.out.println("Insira os valores das alturas: ");
		for(int i = 0; i < n; i++){
			vet[i] = scan.nextDouble();
			soma = soma + vet[i];
		}
		
		System.out.printf("Media = %.2f %n",  (soma / 3));
		
		//scan.close();
	}

}
