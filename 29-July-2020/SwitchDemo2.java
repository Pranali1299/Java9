//String and Boolean

class SwitchDemo {

	public static void main(String[] args) {
	
		String x = "core2Web";
                switch(x) {

                        case "core2Web":
                                System.out.println("camel case");  //print
                                break;
                        case "core2web":
                                System.out.println("small case");
                                break;
                }

		String y = new String("core2web");	
                switch(y) {

                        case "core2Web":
                                System.out.println("camel case");
                                break;
                        case "core2web":
                                System.out.println("small case");  //print
                                break;
                }
	
		/*Error - StringBuffer Cannot be converted into int	
		StringBuffer z = new StringBuffer("core2web");
                switch(z) {

                        case "core2Web":
                                System.out.println("camel case");
                                break;
                        case "core2web":
                                System.out.println("small case");  
                                break;
                }
		*/

		//Boolean - Error : Boolean cannot be converted to int
		/*
		boolean b = true;
                switch(b) {

                        case true:
                                System.out.println("camel case");
                                break;
                        case false:
                                System.out.println("small case");  //print
                                break;
                }
		*/
	}
}
