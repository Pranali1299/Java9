class AvgOfDigit {

	public static void main(String[] args) {
	
		int num = 12345;
		int n = num;

		int m = 0, sum = 0, cnt = 0;
	
		while( num != 0 ) {
			
			m   = num % 10;
			cnt = cnt + 1;
			sum = sum + m;
			num = num / 10;
		}

		System.out.println("\nAverage of digits from number "+n+" is "+ (sum/cnt));
	}
}
