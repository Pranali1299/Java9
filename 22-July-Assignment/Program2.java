class Instagram {

	int verifiedaccounts = 0;

	static void checkInstanceOfObj(Instagram obj){
		
		String ans = null;
		ans = (obj instanceof Instagram) ? "instance of class" : "not instance of class";
		System.out.println(ans);
	}
	void displayAccounts(){

		System.out.println("Verified Instagram Accounts :"+ verifiedaccounts);
	
	}
}
class Facebook {

	void checkInstanceOfObj(Facebook obj){

                String ans = null;
                ans = (obj instanceof Facebook) ? "instance of class" : "not instance of class";
                System.out.println(ans);
        }


	public static void main(String[] args) {
	
		Instagram account = new Instagram();
		Instagram obj = null;
		
		Instagram.checkInstanceOfObj(account); //object
		Instagram.checkInstanceOfObj(obj);     //reference
		
		account.verifiedaccounts = 1200;
		account.displayAccounts();
		
		Facebook fb = new Facebook();
		fb.checkInstanceOfObj(fb);    //object

		Facebook fb1 = null;
                fb.checkInstanceOfObj(fb1);    //Reference
	}
}

