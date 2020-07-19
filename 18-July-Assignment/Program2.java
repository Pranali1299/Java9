class Operator {

	public static void main(String[] args) {
		
		int num = 10;
		int temp=num;
		int ans;

		ans = num>>>=2;
                System.out.println(temp+" >>>=2 : "+ans);

		num=10;
		ans = num<<=3;
		System.out.println(temp+" <<=3 : "+ans);

		num=10;
		ans = num^=2;
                System.out.println(temp+" ^=2 : "+ans);

		num=10;
		ans = ++num;
                System.out.println("++"+temp+" : "+ans);

		num=10;
		ans = ~num;
                System.out.println("~"+temp+" : "+ans);

	
	}
}
