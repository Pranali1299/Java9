class Car {

	int models = 0;

	void displayInfo(){

		System.out.println("No. of Car Models : "+models);
	
	}

	public static void main(String[] args) {

		Car Tcompany = new Car();
		String ans = null;
		ans=(Tcompany instanceof Car) ? "Car has Company Name" : "Car doesn't have Company Name";
		System.out.println(ans);	
	        Tcompany.models = 10;
		Tcompany.displayInfo();
	}
}
