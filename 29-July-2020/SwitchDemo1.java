//int,short,float,double,long,char

class SwitchDemo {

	public static void main(String[] args) {
	
		//Short
		short x = 100;
		switch(x) {                    //byte,short,int,char
		
			case 100:
				System.out.println("First case");      //print
				break;
			case 200:
				System.out.println("Second case");
				break;
		}

		//byte
		byte y = 110;                 //range from -128 to 127
                switch(y) {

                        case 100:
                                System.out.println("First case");
                                break;
                        case 110:
                                System.out.println("Second case");     //print
                                break;
                }
		/*Error - Possible loosy conversion from long to int 

		//long
		long z = 32767;        
                switch(z) {

                        case 32767:
                                System.out.println("First case");
                                break;
                        case -110:
                                System.out.println("Second case");
                                break;
                }
		*/

		/*Error bcz of Float value 
		float f = 20.3f;
                switch(f) {

                        case 20.3:
                                System.out.println("First case");
                                break;
                        case 200:
                                System.out.println("Second case");
                                break;
                }
		*/
		char ch = 'A';
                switch(ch) {

                        case 'B':
                                System.out.println("B char");
                                break;
                        case 'A':
                                System.out.println("A char");    //print
                                break;
                }

		ch = 'A';
                switch(ch) {

                        case 65:
                                System.out.println("A char");   //print
                                break;
                        case 'B':
                                System.out.println("B char");
                                break;
                }

		/*Error
		char ch = 'A';
                switch(ch) {

                        case 65:
                                System.out.println("A Ascii");
                                break;
                        case 'A':                                  //Duplicate case
                                System.out.println("A char");
                                break;
                }
		*/
	}
}

