class BitwiseDemo{

	public static void main(String[] args) {
	
		int x=9;
		int y=10;

		System.out.println("Bitwise operator : &");

		int ans=0;
		ans= x & y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("Ans = "+ans);

		x=16;
		ans=0;
                ans= x & y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
                System.out.println("Ans = "+ans);	

		x=24;
                ans=0;
                ans= x & y;
                System.out.println("x = "+x);
		System.out.println("y = "+y);
                System.out.println("Ans = "+ans);

	}
}
