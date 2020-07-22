class Football {

}

class Cricket {

	public static void main(String[] args) {
	
		Cricket test = new Cricket();
		Cricket oneday = new Cricket();
		Cricket t20 = new Cricket();
		Cricket IPL=null;

		Football fmatch = new Football();

		boolean res;
		res = test instanceof Cricket;
		System.out.println(res);       //true
		System.out.println(oneday instanceof Cricket); //true
		System.out.println(t20 instanceof Cricket );  //true

		System.out.println(IPL instanceof Cricket ); //false

		/* Error
		System.out.println(Cricket instanceof Object);*/

		System.out.println(test instanceof Cricket ); //true
		
		/* Error
		System.out.println(Football instanceof Object ); //before instanceof we can give only ref of obj
		*/

		System.out.println(fmatch instanceof Football ); //true
		System.out.println(fmatch instanceof Object ); //true

	}

}
