class TernaryDemo {

	public static void main(String[] args) {
	
		int x = 25;
		int y = 20;
		int res = 0;

		res = (x < y) ? x : y;
		System.out.println(res);
	
		System.out.println((x > y) ? x : y);

		/* Error  System.out.println() has return type void and res is of int type	
		res = (x<y)? System.out.println(x+" is small") : System.out.println(y+"is small");
		*/

		/* Not a statement
		(x<y)? System.out.println(x+" is small") : System.out.println(y+"is small");
		*/

		String ans = null;
		ans = (x < y) ? "x is small" : "y is small";
		System.out.println(ans);
	}
}
