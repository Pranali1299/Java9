class LogicalDemo{

	public static void main(String[] args) {
	
		int x = 2;
		int y = 3;
		boolean ans;

		ans = (++x < y++) && (x++ < ++y);		
		System.out.println("\nAns= " + ans);		
		System.out.println("x= " + x);			
		System.out.println("y= " + y);			

		ans = (++x <= y++) || (x++ < ++y);		
                System.out.println("Ans= " + ans);		
                System.out.println("x= " + x);			
                System.out.println("y= " + y +"\n");			

	}
}
