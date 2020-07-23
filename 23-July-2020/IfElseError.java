class IfElseDemo {

        public static void main(String[] args) {

                int x = 10;

                if(x == 10)                     //if(10==10) -> true
                        System.out.println("In if statement"); //print
               		System.out.println("Hello");           //print
                
		System.out.println("Out of if");              //print

		if(x < 10)                     //if(10 < 10) -> false
                        System.out.println("In if statement"); 
                        System.out.println("Hello");           //print

                System.out.println("Out of if");              //print


		if(x < 10){                     //if(10 < 10) -> false
                 
		 	System.out.println("In if statement");
                        System.out.println("Hello");       
		}
                System.out.println("Out of if");

		/*Error - else without if
		if(x < 10)                     //if(10 < 10) -> false
                        System.out.println("In if statement"); 
    
		System.out.println("out of if");
		else
			System.out.println("in if statement");
		*/

	}
}
