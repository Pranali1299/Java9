class PowerOfNo {

	void calcPower(int n, int p){
	
		int mult = 1;
		for(int i=0; i<p; i++) {
		
			mult = mult * n;
		}
		System.out.println(n+" to the power "+p+" is "+mult);
	}
	public static void main(String[] args) {
	
		PowerOfNo ob = new PowerOfNo();
		ob.calcPower(10,2);
		ob.calcPower(15,2);
		ob.calcPower(9,3);
	}
}
