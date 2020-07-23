//Program to find angle is acute,right or obtuse

class Angle {

	public static void main(String[] args) {
	
		int a = 20;

		if(a < 90)
			System.out.println("Acute Angle");
		if(a == 90)
			System.out.println("Right Angle");
		if(a > 90)
			System.out.println("Obtuse Angle");
	}
}
