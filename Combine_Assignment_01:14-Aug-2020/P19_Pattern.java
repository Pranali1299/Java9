/*
 
	A	B	C	D

	E	F	G	H
	
	I	J	K	L
	
	M	N	O	P	


*/


class Pattern {

	public static void main(String[] args) {

		int a = 65;	
		for(int i = 1; i<=4; i++) {
		
			for(int j=1 ; j<=4 ; j++) {
			
				System.out.print((char)a+"\t");
				a++;
			}
			System.out.println("\n");
		}
	}
}
