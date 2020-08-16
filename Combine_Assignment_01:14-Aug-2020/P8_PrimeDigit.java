class PrimeDigit {

	void primeDigit(int num) {
	
		System.out.print("\nPrime digits in number "+num+" : ");
		int cnt = 0;
		int m = 0;
		while( num != 0 ) {
			
			m  = num % 10;
			if(m>1){
			cnt=0;
			for(int i = 2; i<=(int)m/2; i++){
			
				if(m%i==0){
					cnt=cnt+1;
					break;
				}
			}
			if(cnt==0){
				System.out.print(m+" ");
			}
			}
			num = num / 10;
		}
		System.out.println();
	}

	public static void main(String[] args){

		PrimeDigit p = new PrimeDigit();
		p.primeDigit(141);
		p.primeDigit(235);
		p.primeDigit(642);
	}

}
