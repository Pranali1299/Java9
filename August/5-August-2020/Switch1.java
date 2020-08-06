class SwitchDemo {

	public static void main(String[] args) {
	
		int floor = 1;
		switch(floor){
		
			case 1:
				{
					char ch = 'S';
					System.out.println("1st Floor");
					switch(ch){
					
						case 'S':
						case 's':
							System.out.println("Shopping");
							break;
						case 'F':
						case 'f':
							System.out.println("snacks");
							break;
						default:
							System.out.println("service not available");
							break;
					}
				}
				break;
			
			case 2:
				{
					char ch = 'M';  //M for movie and p for playstation
					System.out.println("2nd Floor");
					switch(ch){
					
						case 'P':
						case 'p':
							System.out.println("Football");
							break;
						case 'F':
						case 'f':
							System.out.println("games");
							break;
						default:
							System.out.println("service not available");
							break;
					}
				}
				break;
			
			default:
				System.out.println("wrong floor");
				break;
		}
	}

}
