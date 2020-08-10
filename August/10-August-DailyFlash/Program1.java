//print cubes of odd numbers ranging between 1 to 50

class Cubes {

	public static void main(String[] args) {
	
		for(int i=1; i<=50; i++) {
		
			if(i%2 != 0)
				System.out.println(i+"^3 = "+i*i*i);

		}
	}
}
