class LeapYear {

	
	void leapYear(int year){
	
		if(year % 4 == 0) {
		
			if(year % 100 == 0) {
			
				if(year%400 == 0) {
				
					System.out.println(year+" is a leap year");
				}
		
				else {
				
					System.out.println(year+" is not a leap year");
				}
			}

			else {
			
				System.out.println(year+" is a leap year");
			}
		}

		else {

			System.out.println(year+" is not a leap year");
		}
	}
	
	public static void main(String[] args){
		
		LeapYear ly = new LeapYear();

		ly.leapYear(1984);
		ly.leapYear(2100);
		ly.leapYear(2400);
		ly.leapYear(2001);

	}
}
