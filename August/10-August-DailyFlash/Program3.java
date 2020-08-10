//Print series of prime numbers upto entered number from 1.

import java.util.Scanner;
class PrimeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
	
		for(int i=2; i<=n; i++) {
			int cnt = 0;
			for(int j=2; j<=i/2; j++){
			
				if(i%j==0)
					cnt=cnt+1;
			}
			if(cnt==0)
			   System.out.print(i+" ");
		}
		System.out.println();
	}
}
