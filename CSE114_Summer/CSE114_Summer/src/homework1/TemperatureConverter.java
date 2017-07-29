package homework1;


//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 1, part 1: A basic Fahrenheit to Celsius temperature converter
import java.util.Scanner;
public class TemperatureConverter {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a temperature in terms of degrees Fahrenheit: ");
		
		double fahrenheit = sc.nextDouble();
		
		
		double celsius = (fahrenheit-32) * 5.0/9.0;
		System.out.printf("Your celsius temperature is %.2f degrees",celsius);
		
		sc.close();
	}

}
