
class WhileDemo {

	public static void main(String[] args) {
	
		int i = 1;
		int cnt = 0;
	
		while(cnt!=10) {
		
			if( (i % 32 == 0) && (i % 7 == 0)){
			
				
				System.out.print(i+" ");
                                cnt = cnt + 1;
				if(i % 6 == 0){
					System.out.println("\n"+i+" is divisible by 6");
					break;
				}
			}
		
			i= i + 1;
		}
	}
}
