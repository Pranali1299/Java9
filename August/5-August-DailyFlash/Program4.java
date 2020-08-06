//print in reverse order from entered number and find numbers which divisible by 5

import java.util.Scanner;
class Program4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int a = sc.nextInt();

		System.out.println("Reverse order : ");
		for(int i=a; i>=1; i--) {
		
				System.out.print(i+" ");
		}

		System.out.println("\nDivisible by 5 : ");
		for(int i=a; i>=1; i--) {
		
			if(i%5==0)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
