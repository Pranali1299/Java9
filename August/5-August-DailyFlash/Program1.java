//Java program which accepts month no. provide that no. to switch case and print no. of days in that month

class Monthdays {

	void switchCase(int i){
	
		System.out.print(i+" : ");
		
		switch(i) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(" 31 days");
				break;
			case 2:
				System.out.println(" 28 or 29 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(" 30 days");	
				break;
			default:
				System.out.println("Enter number between 1 to 12");
				break;	

		}
	}

	public static void main(String[] args) {
	
		Monthdays number = new Monthdays();
		number.switchCase(7);
		number.switchCase(3);
		number.switchCase(2);
                number.switchCase(9);
	}
}
