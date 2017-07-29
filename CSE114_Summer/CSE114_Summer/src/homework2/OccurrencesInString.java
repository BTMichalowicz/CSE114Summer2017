package homework2;
//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 2, part 3: Occurrences of a digit in a String

import java.util.Scanner;
public class OccurrencesInString {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string, and this program will count how many digits are in it: ");
		
		String str = sc.nextLine();
		
		
		int zeroes =0, ones = 0, twos = 0, threes = 0, fours = 0;
		int fives = 0, sixes = 0, sevens = 0, eights = 0, nines = 0;
		
		
		for(char c: str.toCharArray()){
			
			if(c == '0'){
				zeroes++;
				
			}else if (c=='1'){
				ones++;
				
			}else if (c=='2'){
				twos++;
				
			}else if (c=='3'){
				threes++;
				
			}else if (c=='4'){
				fours++;
				
			}else if (c=='5'){
				fives++;
				
			}else if (c=='6'){
				sixes++;
				
			}else if (c=='7'){
				sevens++;
				
			}else if (c=='8'){
				eights++;
				
			}else if (c=='9'){
				nines++;
				
			}
			
			

			
		}
		
		sc.close();
		
		System.out.println("The occurrences of each digit are as follows: ");
		
		System.out.println(zeroes + (zeroes==1? " 0":" 0s")+ "\n"
				+ ones + (ones==1? " 1":" 1s")+"\n"
				+ twos + (twos==1? " 2":" 2s")+ "\n"
				+ threes +(threes==1? " 3":" 3s")+ "\n"
				+ fours + (fours==1? " 4":" 4s")+ "\n"
				+  fives + (fives==1? " 5":" 5s")+ "\n"
				+sixes + (sixes==1? " 6":" 6s")+ "\n"
				+ sevens +(sevens==1? " 7":" 7s")+ "\n"
			    + eights + (eights==1? " 8":" 8s")+ "\n"
			    + nines +(nines==1? " 9":" 9s")+ "\n");
	
	}
	
	

}
