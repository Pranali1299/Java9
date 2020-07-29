//Check whether a number is odd or even using bitwise operator

class EvenOdd {

	static int isEven(int n) {
	
		System.out.println("\nEntered number : "+n);
		return n;

        }

	public static void main(String[] args) {
	
		int n = 10;

		if((isEven(n)&1)==0){
		
			System.out.println("Even");

		} else {
		
			System.out.println("Odd");
		}

		n = 11;

                if((isEven(n)&1)==0){

                        System.out.println("Even");

                } else {

                        System.out.println("Odd");
                }

		
	}
}
