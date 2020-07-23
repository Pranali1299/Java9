//Logical

class IfDemo {

        public static void main(String[] args) {

                boolean x = true;
		boolean y = false;

                if(x && y) {                             // true && false -> false

                        System.out.println("Hiiiiii");
                }
		System.out.println("Hello");

		y = true;

                if(x && y) {                             // true && true -> true 

                        System.out.println("Hiiiiii");  
                }
                System.out.println("Hello");
	}
}
