
// Program to check the no. is greater tha or less than or equal

class Program3 {

        public static void main(String[] args) {

                int x = 10;
                int y = 20;

                if(x < y) {                                      //if(10<20)->true

                        System.out.println(x+" is less than "+y);    //print
                }
		else if(x > y){
                        System.out.println(x+" is greater than "+y);  //false
                }
		else {
                	System.out.println(x+" is equal to "+y);
		}

		x = 30;
		if(x < y) {                                 //if(30<20)->false

                        System.out.println(x+" is less than"+y);    
                }
		else if(x > y){
                        System.out.println(x+" is greater than "+y);  //print
                }
		else{
		
			System.out.println(x+" is equal to "+y);
		}

		x = 20;
                if(x < y) {                                 //if(30<20)->false

                        System.out.println(x+" is less than"+y);
                }
                else if(x > y){                                 //(30>30)->false
                        System.out.println(x+" is greater than "+y);  
                }
                else{

                        System.out.println(x+" is equal to "+y);   //print
                }

        }
}

