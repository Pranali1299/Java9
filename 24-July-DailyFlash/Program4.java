//Check the chracter is consonant or vowel

class Character {

	void checkCharacter(char c) {
	
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
		
			System.out.println(c+" is Vowel ");
		else

			System.out.println(c+" is Consonant ");
	}

	public static void main(String[] args){
	
		Character c = new Character();
		c.checkCharacter('A');		
		c.checkCharacter('V');
		c.checkCharacter('u');
		c.checkCharacter('p');
	}
}
