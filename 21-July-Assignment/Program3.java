class ShiftOperator {

        public static void main(String[] args) {

                int num;

                int res = 0;

		num = 188;
                res = num >>> 4;
                System.out.println(num+" >>> "+4+" = "+res); // 11

		/*Error
		num = 255;
                res = num <<< 3;
                System.out.println(res); 
		*/
		num = -108;
		res = num >>> 23;
                System.out.println(num+" >>> "+23+" = "+res); //511

		/*Error
		num = -123;
		res = num <<< 15;
		System.out.println(res);
		*/

        }
}
