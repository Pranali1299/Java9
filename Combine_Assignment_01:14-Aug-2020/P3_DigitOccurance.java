class DigitOccurance {

	void countOccurance(long num,int n) {
	
		int cnt = 0;
		long m = 0;
		long no = num;
		while( num != 0 ) {
			
			m  = num % 10;
			if(m==n){
			
				cnt = cnt + 1;
			}
			num = num / 10;
		}
		System.out.println("The occurance of "+n+" in number "+no+" is "+cnt);
	}

	public static void main(String[] args){

		DigitOccurance d = new DigitOccurance();
		
		d.countOccurance(34566970562L,6);
		d.countOccurance(908965999,9);
		d.countOccurance(1228732,2);
	}

}
