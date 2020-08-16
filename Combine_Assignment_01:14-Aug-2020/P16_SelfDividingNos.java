class SelfDividingNos {

	public static void main(String[] args) {

		System.out.println("\nSelf dividing numbers from 1 to 100 : ");
		int i=0;

		while(i<=100) {
		
			int m = 0;
			int num = i;
			int flag = 0;

			while(i != 0) {
		
				m = i % 10;
				
				if(m!=0){
					
					if(num % m != 0){

						flag=0;
						break;
					}
					else
						flag=1;
				}

				i = i / 10;
			}
			if(flag==1){
			
				System.out.print(num+" ");
			}
			i=num;
			i=i+1;
		}
		System.out.println();
	}
}
