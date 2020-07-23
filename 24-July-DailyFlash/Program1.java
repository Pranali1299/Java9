/*Program to check whether number is even or odd.
  Take function like 
  	int evenOdd(int);
  op: a is even no.
      b is odd no.
*/

class EvenOdd {

	int evenOdd(int a){

		return a;
	}

	public static void main(String[] args) {
	
		EvenOdd obj = new EvenOdd();
		
		int a = 10;
                if (obj.evenOdd(a)%2==0)
                        System.out.println(a+" is Even Number");

                else
                        System.out.println(a+" is Odd Number");


		a = 15;
		if (obj.evenOdd(a)%2==0)
			System.out.println(a+" is Even Number");
		
		else
			System.out.println(a+" is Odd Number");
		
	}
}
