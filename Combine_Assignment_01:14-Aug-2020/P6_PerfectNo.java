//check the number is perfect number or not

class PerfectNumber{
	
	void checkPerfectNo(int n) {

		System.out.println();		
		int sum = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n+" is a Perfect Number");
		}
		else {
			System.out.println(n+" is not a Perfect Number");
		}
	}
	public static void main(String[] args) {
	
		PerfectNumber no = new PerfectNumber();

		no.checkPerfectNo(6);
		no.checkPerfectNo(20);
		no.checkPerfectNo(28);
		no.checkPerfectNo(55);
	}
}
