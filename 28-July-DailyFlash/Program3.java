class LargestNumber {

	void fun(int x, int y, int z) {

		System.out.println("\nEntered numbers are : "+x+" "+y+" "+z);
		if(x > y && x > z ) {                   

                        System.out.println("Largest number is "+x);
                }
		else if(y > x && y > z){
                        System.out.println("Largest number is "+y);
                }
		else{

			System.out.println("Largest number is "+z);
		}
	}
	
	public static void main(String[] args){
	
		LargestNumber obj = new LargestNumber();
		
		obj.fun(40,70,30);
		obj.fun(10,20,30);
		obj.fun(20,40,60);
	}
}
