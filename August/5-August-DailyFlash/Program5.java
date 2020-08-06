//print table of 3 and even numbers in that table

class Program5 {

	public static void main(String[] args) {

		System.out.println("Table of 3 is : ");
		for(int i=1; i<=10; i++) {
		
				System.out.print(i*3 + " ");
		}

		System.out.println("\nEven numbers present in table : ");
		for(int i=1; i<=10; i++) {
		
			if((i*3)%2==0)
				System.out.print(i*3+" ");
		}
		System.out.println();
	}
}
