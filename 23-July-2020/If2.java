//Unary

class IfDemo {

        public static void main(String[] args) {

                int x = 10;
               
                if(++x <= 10) {                             // x is 11 so condition false

                        System.out.println("Hiiiiii");
                }
                System.out.println("Hello");

                x = 10;
                if(x++ <= 10) {                         // 10 <= 10

                        System.out.println("Hiiii");
                }
                System.out.println("Hello");

        }
}

