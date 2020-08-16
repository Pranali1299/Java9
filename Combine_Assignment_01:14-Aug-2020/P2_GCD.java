class GCD {

	void calcGCD(int i, int j) {
        
		System.out.print("GCD of numbers "+i+" & "+j+" is ");
		
		while(i != j)
        	{
            		if(i > j)
                		i -= j;
            		else
                		j -= i;
       	 	}

        	System.out.println(i);
	}

	public static void main(String[] args){

		GCD no = new GCD();
		
		no.calcGCD(20,30);
		no.calcGCD(45,100);
		no.calcGCD(124,78);
	}
}
