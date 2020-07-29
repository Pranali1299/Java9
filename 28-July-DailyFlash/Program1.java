class SwitchDemo {

	void fun(int var) {
	
		System.out.println("\nEntered number = "+var);

                switch(var) {

                        case 1:
                                System.out.println("Monday");
                                break;
                        case 2:
                                System.out.println("Tuesday");
                                break;
                        case 3:
                                System.out.println("Wednesday");
                                break;
                        case 4:
                                System.out.println("Thursday");
                                break;
                        case 5:
                                System.out.println("Friday");
                                break;
                        case 6:
                                System.out.println("Saturday");
                                break;
                        case 7:
                                System.out.println("Sunday");
                                break;
                        default:
                                System.out.println("Enter number between 1 to 7");
                                break;

                }

	}

	public static void main(String[] args) {


		SwitchDemo obj = new SwitchDemo();
		obj.fun(3);
		obj.fun(8);
		obj.fun(7);
	}
}
