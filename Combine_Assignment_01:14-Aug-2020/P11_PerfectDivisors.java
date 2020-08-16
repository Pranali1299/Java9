class PerfectDivisors {

        void divisors(int n){

		System.out.println("\nPerfect Divisors of "+n);
                for(int i=2; i<=(int)n/2; i++) {

                        if(n%i == 0)
				System.out.print(i+" ");
                }
		System.out.println();
        }

        public static void main(String[] args) {

                PerfectDivisors ob = new PerfectDivisors();
                ob.divisors(24);
                ob.divisors(30);
                ob.divisors(45);
		ob.divisors(56);
        }
}
