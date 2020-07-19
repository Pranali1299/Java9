class Operator3	{
	
	public static void main(String []args){

		int i,j;
		boolean ans;

		i=4;
		j=5;	
		System.out.println("i = "+i+", j = "+j +" : ");
		System.out.println("("+i+"++ >= "+j+"++) && (--"+j+" < "+i+"++) : ");
		ans = (i++ >= j++) && (--j < i++);
		System.out.println("Answer = " + ans);
		System.out.println("i = " + i);
		System.out.println("j = " + j);

		i=4;
		j=5;		
		System.out.println("\ni = "+i+", j = "+j +" : ");
                System.out.println("(--"+i+" < "+j+"--) || ("+j+"++ >= ++"+i+") : ");
		ans = (--i < j--) || (j++ >= ++i);
		System.out.println("Answer = " + ans);
                System.out.println("i = " + i);
                System.out.println("j = " + j);
               
	}
}
