//check number is prime or not

class PrimeNumber {

	void checkPrime(int n) {
	
		int cnt=0;
		
		if(n>1){

		    for(int i=2; i<=(int)n/2; i++){
		    
			    if(n%i == 0){

				    cnt=cnt+1;
				    break;
			    }
		    }
		}
	
		else {
		
			cnt=cnt+1;
		}
	
		if(cnt==0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

	public static void main(String[] args) {
	
		PrimeNumber p = new PrimeNumber();
		p.checkPrime(13);
		p.checkPrime(1);
		p.checkPrime(19);
		p.checkPrime(33);
	}
}
