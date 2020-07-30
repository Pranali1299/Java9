import java.util.*;

class Calculator{

	void calc(int a, int b) {
	

		Scanner sc = new Scanner(System.in);

                System.out.println("\nEnter operator : ");
                char op = sc.next().charAt(0);
	
		System.out.println("Operands : "+a+" "+b+" & Operator : "+op);
	
		switch(op) {

		
			case '+' :
				System.out.println(a+" + "+b+" = "+(a + b));
				break;
			case '-' :
				System.out.println(a+" - "+b+" = "+(a - b));
				break;
			case '*' :
				System.out.println(a+" * "+b+" = "+(a * b));
				break;
			case '/' :
				System.out.println(a+" / "+b+" = "+(a / b));
				break;
			default :
				System.out.println("Invalid Operator");

		}
	}

	public static void main(String[] args) {
	
		Calculator obj = new Calculator();
		obj.calc(10,20);
		obj.calc(30,20);
		obj.calc(15,2);
		obj.calc(40,5);
	}
}
