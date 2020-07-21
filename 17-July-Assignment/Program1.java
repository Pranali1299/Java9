class Dominos {

	int price, quantity;
	static int total=0;
	static void bill(){
	
		System.out.println("Total Bill = "+total);
	}

	public static void main(String args[]) {
	
		Dominos pizza = new Dominos();
		pizza.price = 199;
		pizza.quantity = 2;
		Dominos.total = total + pizza.price * pizza.quantity;

		Dominos fries = new Dominos();
		fries.price = 100;
		fries.quantity = 2;
		Dominos.total = total + pizza.price * pizza.quantity;
		
		Dominos.bill();
	}
}
