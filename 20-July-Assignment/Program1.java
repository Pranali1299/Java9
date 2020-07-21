class BitwiseOperator{

	public static void main(String[] args) {
	

		int x=9;
		int y=10;
		System.out.println("Integer : ");
		System.out.println(x+" & "+y+" = "+  (x & y) );   //8
		System.out.println(x+" | "+y+" = "+  (x | y) );   //11
		System.out.println(x+" ^ "+y+" = "+  (x ^ y) );   //3

		long a = 2000000000;
                long b = 1000000000;
                System.out.println("\nLong : ");
                System.out.println(a+" & "+b+" = "+  (a & b) );   //8
                System.out.println(a+" | "+b+" = "+  (a | b) );   //11
                System.out.println(a+" ^ "+b+" = "+  (a ^ b) );   //3

		/* Error
		float i = 7.84f;
                float j = 12.30f;
                System.out.println("\nFloat : ");
                System.out.println(i+" & "+j+" = "+  (i & j) );   
                System.out.println(i+" | "+j+" = "+  (i | j) );   
                System.out.println(i+" ^ "+j+" = "+  (i ^ j) );
		*/
		/*Error
		double i = 7.84;
                double j = 12.30;
                System.out.println("\nFloat : ");
                System.out.println(i+" & "+j+" = "+  (i & j) );
                System.out.println(i+" | "+j+" = "+  (i | j) );
                System.out.println(i+" ^ "+j+" = "+  (i ^ j) );
		*/

		char i = 'a';
                char j = 'b';
                System.out.println("\nCharacter : ");
                System.out.println(i+" & "+j+" = "+  (i & j) );
                System.out.println(i+" | "+j+" = "+  (i | j) );
                System.out.println(i+" ^ "+j+" = "+  (i ^ j) );

	}
}

