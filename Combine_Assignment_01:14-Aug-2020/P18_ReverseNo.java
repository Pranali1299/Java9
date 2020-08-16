//print given number is reverse order

class ReverseNumber {

	public static void main(String[] args) {
	
		int num = 420;
		int m = 0;
	
		System.out.print(num + " : ");

		while(num != 0) {
		
			m = num % 10;
			System.out.print(m);
			num = num / 10;
		}
		System.out.println("\n");

	}
}
