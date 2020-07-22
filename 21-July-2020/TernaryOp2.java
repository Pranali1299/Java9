class TernaryDemo {

        public static void main(String[] args) {

                int x = 25;
                int y = 20;
                int z = 22;

		int res = 0;
                res = (x > y) ? ( (x>z) ? x : z) : ((y>z)? y : z);
                System.out.println("Larger no("+x+","+y+","+z+") = "+res);

		res = (x < y) ? ( (x<z) ? x : z) : ((y<z)? y : z);
                System.out.println("Smaller no("+x+","+y+","+z+") = "+res);

		x=25;
		y=30;
		z=15;
		res = (x > y) ? ( (x>z) ? x : z) : ((y>z)? y : z);
                System.out.println("Larger no("+x+","+y+","+z+") = "+res);

		res = (x < y) ? ( (x<z) ? x : z) : ((y<z)? y : z);
                System.out.println("Smaller no("+x+","+y+","+z+") = "+res);

       }
}

