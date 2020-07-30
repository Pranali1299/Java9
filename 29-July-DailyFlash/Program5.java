//Check the entered number is zero or less than zero or greater than zero

import java.util.Scanner;

class Zero {

	void checkZero(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number : ");
		int x = sc.nextInt();

		if(x<0) {
		
			System.out.println("Entered number is less than zero");
		}
		else if(x>0) {
		
			System.out.println("Entered number is greater than zero");
		}
		else
			System.out.println("Entered number is equal to zero");
	}

	public static void main(String[] args){
	
		Zero obj = new Zero();
		obj.checkZero();
		obj.checkZero();
		obj.checkZero();
	}
}
