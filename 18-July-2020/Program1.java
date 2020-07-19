class RelationalOp {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		boolean ans;

		ans = num1<num2;
                System.out.println(num1+" less than "+num2+" : "+ans);

		ans = num1>num2;
                System.out.println(num1+" greater than "+num2+" : "+ans);

		ans = num1<=num2;
                System.out.println(num1+" less than equal to "+num2+" : "+ans);

                ans = num1>=num2;
               	System.out.println(num1+" greater than equal to "+num2+" : "+ans);

		ans = num1==num2;
                System.out.println(num1+" equal to "+num2+" : "+ans);

		ans = num1!=num2;
                System.out.println(num1+" not equal to "+num2+" : "+ans);    

	}
}
