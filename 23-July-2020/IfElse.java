class IfElseDemo {

        public static void main(String[] args) {

                int x = 10;
                int y = 20;

                if(x < y) {                                      //if(10<20)->true

                        System.out.println(x+" is smaller than "+y);    //print
                }
		else {
                	System.out.println(y+" is greater than "+x);
		}

		System.out.println("out of if else");          //print

		x = 30;
		if(x < y) {                                      //if(10<20)->false

                        System.out.println(" Hiiiii ");    //print
                }
                else {
                        System.out.println(" Hello ");   //print
                }

	
		x = 10;
		y = 11;

		if(++x <= y++) {                 //if (11<=11) -> true
		
			System.out.println("In if statement");    //print
			System.out.println("x = "+x);             //11
			System.out.println("y = "+y);             //12
		}
		else {
		
			System.out.println("In else statement");
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		}
		System.out.println("out of if else");
				
		x = 10;
		y = 11;

		if(++x <= ++y) {                 //if (11<=12) -> true
		
			System.out.println("In if statement");  //print
			System.out.println("x = "+x);           //11
			System.out.println("y = "+y);           //12
		}
		else {
		
			System.out.println("In else statement");
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		}
		System.out.println("out of if else");
		
		x = 10;
		y = 11;

		if(++x <= --y) {                 //if (11<=10) -> flase
		
			System.out.println("In if statement"); 
			System.out.println("x = "+x);           
			System.out.println("y = "+y);           
		}
		else {
		
			System.out.println("In else statement");   //print 
			System.out.println("x = "+x);              //11
			System.out.println("y = "+y);              //10
		}
		System.out.println("out of if else");
	}
}
