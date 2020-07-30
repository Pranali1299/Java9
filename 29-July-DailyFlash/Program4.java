import java.util.Scanner;

class Numbers {

	void fun() {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter number(From 0 to 9) : ");
		int x = sc.nextInt();

                switch(x) {
			
			default:
                                System.out.println("Enter valid number(bet 0 to 9)"); 
				break;	
                        case 0:
                                System.out.println("Zero");        
                                break;
                        case 1:
                                System.out.println("One");        
                                break;
                        case 2:
                                System.out.println("Two");
                                break;
                        case 3:
                                System.out.println("Three");
                                break;
                        case 4:
                                System.out.println("Four");
                                break;
                        case 5:
                                System.out.println("Five");
                                break;
                        case 6:
                                System.out.println("Six");
                                break;
                        case 7:
                                System.out.println("Seven");
                                break;
                        case 8:
                                System.out.println("Eight");
                                break;
                        case 9:
                                System.out.println("Nine");
                                break;
                                 
                }
	}

	public static void main(String[] args) {

		Numbers obj = new Numbers();
		obj.fun();
		obj.fun();
		obj.fun();
		obj.fun();
		obj.fun();
		obj.fun();
	}
}
