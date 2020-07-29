class ToggleCharacter {

	void character(char ch) {
	
		System.out.println("\nEntered Character : "+ch);

		if(ch>=65 && ch<=91) {
		
			System.out.println(Character.toLowerCase(ch));
		}
		else if(ch>=97 && ch<=123) {
			System.out.println(Character.toUpperCase(ch));
		}
		else {
			System.out.println("Enter character from a to z or A to Z");
		}
	}

	public static void main(String[] args){
	
		ToggleCharacter obj = new ToggleCharacter();
		obj.character('a');
		obj.character('Q');
		obj.character('/');
	}
} 
