//count the number of steps required for a number to reduce it to zero

class Program15 {

	void checkCount(int num) {
	
		System.out.println("\nNumber = "+num);
		int cnt = 0;
		int m = 0;
		while( num != 0 ) {
			
			if(num%2==0){
				num  = num / 2;
				cnt = cnt+1;
			}
			else{
				num = num-1;
				cnt=cnt+1;
			}

		}
		System.out.println("Steps required = "+cnt);
	}

	public static void main(String[] args){

		Program15 p = new Program15();
		p.checkCount(8);
		p.checkCount(123);
	}

}
