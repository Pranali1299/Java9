class CountDigits {

	public static void main(String[] args) {
	
		int num = 123456;

		int cnt = 0;
		int m = 0;
		while( num != 0 ) {
			
			m  = num % 10;
			cnt = cnt + 1;
			num = num / 10;
		}
		System.out.println("Digits in 123456 : "+cnt);
	}
}
