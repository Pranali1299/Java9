//Print series of factorials of numbers ranging upto entered no. from 1

import java.util.Scanner;

class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
	
		for(int i=1; i<=n; i++){
		
			int fact=1;
			for(int j=1; j<=i; j++) {
			
				fact=fact*j;
			}

			System.out.println("Factorial of "+i+" = "+fact);
		}

	}
}
