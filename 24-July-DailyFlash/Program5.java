/*Check the attendance is less than or greater than 75% and 
  whether student is eligible for exam or not.
  Take function like this : boolean isEligible(int);
*/
class Student {

        boolean isEligible(int a) {

                if(a > 75 )
			return true;
                else
			return false;
        }

        public static void main(String[] args){

                Student attendance = new Student();
		
		int a = 65;
		System.out.println("Student's attendace is "+a+"%");
                
		if(attendance.isEligible(a)==true)
		
			System.out.println("Student is Eligible for the Exam");
		else
		
			System.out.println("Student is not eligible for Exam");
        }
}

