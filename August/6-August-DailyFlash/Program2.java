class Digits {

	public static void main(String[] args) {
	
		int num = 12345;
		System.out.println(num);

		int m = 0;
		int sum = 0;
		int mul = 1;
		while( num != 0 ) {
			
			m  = num % 10;
			if(m%2 == 0)
				sum = sum + m;
			else
				mul = mul * m;

			num = num / 10;
		}
		System.out.println("Sum of even digits : "+sum);
		System.out.println("Mult of odd digits : "+mul);
	}
}
