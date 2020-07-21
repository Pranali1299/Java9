class UnsignedRightShiftDemo {

        public static void main(String[] args) {

                int num1 = 35;
                int num2 = -35;

                int res = 0;

                res = num1 >>> 5;
                System.out.println(res); // 1

		res = num2 >>> 25;
                System.out.println(res); // 127

	}
}
