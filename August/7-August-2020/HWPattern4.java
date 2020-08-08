/*
 
  0	3	8
  15	24	35
  48	63	80

*/

class Pattern {

	public static void main(String[] args) {

		int a = 0, b = 2;	
		for(int i = 1; i<=3; i++) {
		
			for(int j=1 ; j<=3; j++) {
			
				System.out.print(a*b + "\t");
				a++;
				b++;
			}
			System.out.println();
		}
	}
}
