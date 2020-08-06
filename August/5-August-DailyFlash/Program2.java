class Scholarship {

	void checkEligibility(int year, int marks){

		System.out.println("\nYear : "+year+"\nMarks : "+marks);
		
		switch(year) {
		
			case 1:
			case 2:
				System.out.println("Student not eligible for educational Scolarship");
				break;
			case 3:
				switch(marks){
					case 40:
					case 50:
					case 60:
					case 70:
						System.out.println("Student not eligible for educational Scolarship");
						break;
					case 80:
					case 90:
					case 100:
						System.out.println("Student eligible for educational Scolarship");
						break;
					default:
						System.out.println("Enter valid marks");
						break;
				}
				break;
			default:
				System.out.println("Enter year between 1 to 3");
		}

	
	}
	public static void main(String[] args){
	
		Scholarship s = new Scholarship();
		s.checkEligibility(3,80);
		s.checkEligibility(2,70);
		s.checkEligibility(3,50);
		s.checkEligibility(3,90);
	}
}
