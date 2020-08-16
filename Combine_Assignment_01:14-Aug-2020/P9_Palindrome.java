//Check number is palindrome or not

class PalindromeNo {

	public static void main(String[] args) {
	
		int num = 121;
		int k = num;
		int rem = 0;
		int rev = 0;

		while(num != 0) {
		
			rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		if(rev==k)
			System.out.println(k+" is palindrome number");
		else
			System.out.println(k+" is not palindrome number");
	}
}
