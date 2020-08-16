//Count the digits in the number

class CountDigits {

	public static void main(String[] args) {
	
		int num = 234;

		int cnt = 0;
		int m = 0;
		while( num != 0 ) {
			
			m  = num % 10;
			cnt = cnt + 1;
			num = num / 10;
		}
		System.out.println("Digits in 234 : "+cnt);
	}
}
