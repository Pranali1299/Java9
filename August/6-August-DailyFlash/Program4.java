class MaxDigit {

	public static void main(String[] args) {
	
		int num = 12357798;
		int n = num;

		int m = 0;
		int max = 0;
		
		while( num != 0 ) {
			
			m  = num % 10;
			
			if(m > max)
				max = m;

			num = num / 10;
		}

		System.out.println("Maximum digit from "+n +" is "+max);
	}
}
