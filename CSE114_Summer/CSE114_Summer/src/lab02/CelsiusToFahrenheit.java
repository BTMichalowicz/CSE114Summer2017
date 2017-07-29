package lab02;
//Benjamin Michalowicz (SBU ID: 110982339)
//Celsius to Fahrenheit
import java.util.Scanner;
public class CelsiusToFahrenheit {

	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value in degrees Celsius: ");
		
		int celsius = sc.nextInt();
		
		double fahrenheit = (celsius*1.8)+32;
		
		System.out.println("The temperature in fahrenheit is " + fahrenheit  + " degrees");
		sc.close();
	}
}