class VowelConsonant {

	public static void main(String[] args) {
	
		char c = 'U';
		String sVar;
	
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')

			sVar = "vowel";
		else

			sVar = "consonant";

		switch(sVar) {
		
			case "vowel":

				System.out.println(c+" is Vowel\n");
				break;

			case "consonant":
				
				System.out.println(c+" is Consonant\n");
				break;
			default:

				System.out.println("invalid\n");
				break;
		}
	}
}
