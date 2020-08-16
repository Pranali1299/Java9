class LCM {

	void calcLCM(int i, int j) {
        
		System.out.print("LCM of numbers "+i+" & "+j+" is ");
		
		int x = i, y = j;

		while(i != j)
        	{
            		if(i > j)
                		i -= j;
            		else
                		j -= i;
       	 	}

		int lcm = (x * y)/i;
		System.out.println(lcm+"\n");
	}

	public static void main(String[] args){

		LCM no = new LCM();
		
		no.calcLCM(10,15);
		no.calcLCM(45,100);
		no.calcLCM(124,78);
	}
}
