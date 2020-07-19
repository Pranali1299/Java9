class PrePostDemo{

	public static void main(String[] args) {
	
		int num = 10;
		int ans = 0;
		
		//Increcerment
		ans = ++num;
		System.out.println(ans);
		System.out.println(num);

		//PostIncrement
		ans=0;
		num=10;
		ans = num++;
                System.out.println(ans);
                System.out.println(num);

		//PreDecrement
		ans=0;
                num=10;
                ans = --num;
                System.out.println(ans);
                System.out.println(num);
		
		//PostDecrement
		ans=0;
                num=10;
                ans = num--;
                System.out.println(ans);
                System.out.println(num+"\n");

		ans=0;
		num=10;
		//PreIncrement
		ans = ++num;
                System.out.println(ans);
                System.out.println(num);

                //PostIncrement
                ans = num++;
                System.out.println(ans);
                System.out.println(num);

                //PreDecrement
                ans = --num;
                System.out.println(ans);
                System.out.println(num);

                //PostDecrement
                ans = num--;
                System.out.println(ans);
                System.out.println(num+"\n");



	}
}
