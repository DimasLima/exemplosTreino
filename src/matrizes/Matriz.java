package matrizes;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numNegativo =0;
		
		System.out.println("Insira um numero: ");
		int n = scan.nextInt();
			
		System.out.println("Insira os valores da matriz "+n+"x"+n+": ");
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				mat[i][j] = scan.nextInt();	
				if(mat[i][j] < 0){
					numNegativo++;
				}
			}			
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(" "+mat[i][j]);				
			}
			System.out.println("\n");
		}	
		
		System.out.print("Main diagonal: \n ");
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if( i == j){
					
					System.out.print(" "+mat[i][j]);
				}
			}
		}	
		System.out.println("\n");
		System.out.print("Negative numbers = "+numNegativo);
		scan.close();
	}

}
