//Print addition of 1 to 10 with 10 to 1

class Addition {

	public static void main(String[] args) {
	
		int a = 10;
		for(int i=1; i<=10; i++) {
		
			System.out.println(i+" + "+a+" = "+(i+a));
			a--;
		}
	}

}
