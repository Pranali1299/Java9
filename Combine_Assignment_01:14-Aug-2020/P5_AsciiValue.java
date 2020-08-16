//print ascii value of character

class AsciiValue {

	
	void asciiValue(String s){

		System.out.println("\n"+s);
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i)+" : "+(int)s.charAt(i));
		}
	}
	
	public static void main(String[] args){
		
		AsciiValue a = new AsciiValue();
		a.asciiValue("abcd");
		a.asciiValue("Pranali");
		a.asciiValue("xyz");
	}
}
