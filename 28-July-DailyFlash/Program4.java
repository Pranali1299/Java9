//Check divisibility of number by 2 using bitwise operator

class Program4 {

	static boolean isDivisible(int number, int b) {

		System.out.println("\nDivisor = "+number+" Dividend = "+b);
		
		if((number /b)==((double)number)/b)
			return true;
		else
			return false;

        }

	public static void main(String[] args) {
	
		int divisor , dividend;

		divisor = 10;
		if(isDivisible(divisor,dividend = 2)){
		
			System.out.println("Yes");

		} else {
		
			System.out.println("No");
		}

		divisor = 15;
                if(isDivisible(divisor,dividend = 2)){

                        System.out.println("Yes");

                } else {

                        System.out.println("No");
                }

		
	}
}
