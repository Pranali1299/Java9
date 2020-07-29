class IfLadderDemo {

        void fun(int x){

                System.out.println("Number = "+x);

                if( x>=0 && x<=10 ){                            //true && false -> false

                        System.out.println("Number between 0 and 10");

                } else if(x>=11 && x<=20){

                        System.out.println("Number between 11 and 20");

                } else if(x>=21 && x<=30){

                        System.out.println("Number between 21 and 30");

                } else if(x>=31){

                        System.out.println("Number greater than 30");
                }
                else {

                        System.out.println("Enter positive number");
                }
	}

        public static void main(String[] args) {


		IfLadderDemo obj = new IfLadderDemo();
		obj.fun(25);
		obj.fun(32);
		obj.fun(-10);
		obj.fun(12);
        }
}
