package lab04;
//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 4m oart 1: Kilogram to Pound Conversion with Loop
public class KgToPounds {
	
	public static void main(String[] args){
		
		int pounds = 1;
		double kilo = 2.20;
		System.out.println("Kilograms\tPounds");
		for (pounds = 1; pounds<=200; pounds++){
			System.out.printf("%d \t\t %.2f \n", pounds, (pounds*kilo));
		}
	
	}

}
