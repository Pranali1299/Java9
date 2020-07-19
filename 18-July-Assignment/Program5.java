class Pune {

	static int covidActiveCases = 15000;
	int totalCases = 30000;

	static void noCorona() {
	
		System.out.println("Corona Deatils In Pune : ");
	}

	void lockdown(){

		covidActiveCases++;
		totalCases++; 		
		System.out.println("Covid Active Cases in Pune = " + covidActiveCases);
                System.out.println("Total Cases in Pune = " + totalCases);


		}
}

class Mumbai {

	static int covidActiveCases = 100000;
               int totalCases = 200000;

        static void noCorona() {

                System.out.println("\nCorona details in Mumbai : ");
        }


	void lockdown(){
	
		covidActiveCases++;
                totalCases++;
		System.out.println("Covid Active Cases in Mumbai = " + covidActiveCases);
		System.out.println("Total Cases in Mumbai = " + totalCases);

		}

}

class Corona {

	public static void main(String[] args) {
	
		Pune p = new Pune();
	
		p.noCorona();
		p.lockdown();
		p.lockdown();

		Mumbai m = new Mumbai();
                
		m.noCorona();
                m.lockdown();
                m.lockdown();

	}
}
