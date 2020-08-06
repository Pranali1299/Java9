//numbers divisible by 4 and 12 bet 1 to 100
class ForDemo {

	public static void main(String[] args) {
	
		for(int i=1; i<=100; i++) {
		
			if(i%4==0 && i%12==0){
				System.out.println(i);
			}
		}
	}
}
