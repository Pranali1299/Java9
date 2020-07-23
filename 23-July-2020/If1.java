//Relational op
class IfDemo {

        public static void main(String[] args) {

                int x = 10;
                int y = 20;

                if(x < y) {

                        System.out.println(x+" is smaller than "+y);
                }
                System.out.println("Out of if statement");

                x = 30;
                if(x < y) {

                        System.out.println(x+" is smaller than "+y);
                }
                System.out.println("Out of if statement");

        }
}

