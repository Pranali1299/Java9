
class SwitchDemo {

	void fun(int var) {
	
		System.out.println("\nvar = "+var);
		System.out.println("Before switch");
                switch(var) {
			
			default:
                                System.out.println("In default");  //print                
                        case 1:
                                System.out.println("One");        //print
                                break;
                        case 2:
                                System.out.println("Two");
                                break;
                        case 3:
                                System.out.println("Three");
                                break;
                        case 4:
				{
                                System.out.println("Four");
                                break;
				}
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
                        case 10:
                                System.out.println("Ten");
                                break;
                      
                }
                System.out.println("After switch");

	}

	public static void main(String[] args) {

		SwitchDemo obj = new SwitchDemo();
		obj.fun(12);
	}
}
