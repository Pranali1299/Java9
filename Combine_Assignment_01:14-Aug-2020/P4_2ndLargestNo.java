class SecLargeNo {

	void fun(int[] a) {
	
		System.out.print("\nGiven Array : ");
		for(int i=0;i<a.length;i++) {
		
			System.out.print(a[i]+" ");
		}
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++ ){
                        	if(a[i]<a[j]){
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
                }
		System.out.println("\n2nd Largest Element is "+a[1]);
	}

	public static void main(String[] args) {
	
		SecLargeNo s = new SecLargeNo();
		int a[] = {455,800,56,39,290,18,383,3,290,29,10};
		s.fun(a);
		int b[] = {10,9,4,5,6,7,8,3};
		s.fun(b);
		int c[] = {10,8,56,23,45,97};
		s.fun(c);
	}
}
