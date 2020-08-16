/*
 
        A       B       C       D

	a	b	c	d

        E       F       G       H

	e	f	g	h

*/


class Pattern {

        public static void main(String[] args) {

                int A = 65;
		int a = 97;

                for(int i = 1; i<=4; i++) {

                	for(int j=1 ; j<=4 ; j++) {

				if(i%2 != 0){
					
					System.out.print((char)A+"\t");
                                	A++;
				}
				else {
					System.out.print((char)a+"\t");
                                	a++;
				}
                        }
                        System.out.println("\n");
                }
        }
}
