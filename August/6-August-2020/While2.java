/*
 
   135 = 1 + 3 + 5 = 9

*/

class WhileDemo {

	public static void main(String[] args) {
	
		int num = 135;
		int rem = 0;
		int sum = 0;

		while(num != 0) {
		
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}

		System.out.println("Sum of digits in 135 = "+sum);
	}
}
