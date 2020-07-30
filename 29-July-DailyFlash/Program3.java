import java.util.Scanner;

class RTO{

	void rtoCode(){

		Scanner sc = new Scanner(System.in);

                System.out.println("\nEnter RTO Code(MH/MP/DL/AP/GJ) : ");
                String s = sc.next();


		switch(s) {

		
			case "MP" :
				System.out.println("Madhya Pradesh");
				break;
			case "MH" :
				System.out.println("Maharashtra");
				break;
			case "DL" :
				System.out.println("Delhi");
				break;
			case "AP" :
				System.out.println("Andra-Pradesh");
				break;
			case "GJ":
				System.out.println("Gujrat");
				break;
			default :
				System.out.println("Invalid");
				break;
		}
	}

	public static void main(String[] args) {
	
		RTO obj = new RTO();
		obj.rtoCode();
		obj.rtoCode();
		obj.rtoCode();
		obj.rtoCode();
		obj.rtoCode();
		obj.rtoCode();
	}
}
