//print the minimum number amongst three numbers

class MinNumber {

	void fun(int x, int y, int z) {

		System.out.println("\nEntered numbers are : "+x+" "+y+" "+z);
		if(x < y && x < z ) {                   

                        System.out.println("Minimum number is "+x);
                }
		else if(y < x && y < z){
                        System.out.println("Minimum number is "+y);
                }
		else{

			System.out.println("Minimum number is "+z);
		}
	}
	
	public static void main(String[] args){
	
		MinNumber obj = new MinNumber();
		
		obj.fun(40,70,30);
		obj.fun(10,20,30);
		obj.fun(20,40,60);
	}
}
