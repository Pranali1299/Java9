
class ContinueDemo {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 40; i++) {
		
			if(i % 7 == 0 && i % 5 == 0)
				continue;
			else
				System.out.println(i);
		}

	}
}
