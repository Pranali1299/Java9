class RightShiftDemo {

        public static void main(String[] args) {

                int num1 = 95;
                int num2 = -95;

                int res = 0;

                res = num1 >> 4;
                System.out.println(res); // 5

                res = num2 >> 4;
                System.out.println(res); //-6

		num1 = -125;
		res = num1 >> 5;
                System.out.println(res); //-4

        }
}

