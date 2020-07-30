import java.util.Scanner;

class Language{

	void lang(){

		Scanner sc = new Scanner(System.in);

                System.out.println("\nEnter Character(J/R/P/H/C) : ");
                char ch = sc.next().charAt(0);


		switch(ch) {

		
			case 'J' :
				System.out.println("Java");
				break;
			case 'P' :
				System.out.println("Python");
				break;
			case 'R' :
				System.out.println("Ruby");
				break;
			case 'C' :
				System.out.println("C++");
				break;
			case 'H':
				System.out.println("HTML");
				break;
			default :
				System.out.println("Invalid Character");
				break;
		}
	}

	public static void main(String[] args) {
	
		Language obj = new Language();
		obj.lang();
		obj.lang();
		obj.lang();
		obj.lang();
		obj.lang();
		obj.lang();
	}
}
