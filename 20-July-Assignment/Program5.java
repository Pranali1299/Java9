class Cricket{
    
    static int target = 200;
    int runs;
    
    static void display(){
        System.out.println("Runs required : " + target);
    }
    
    void runs(){
        target = target - runs;
    }
  
    public static void main(String[] args) {
	    
	    Cricket MI = new Cricket();
	    System.out.println("Total runs = "+Cricket.target);
	    MI.runs = 120;
	    MI.runs();
	    MI.display();
    }	
}
