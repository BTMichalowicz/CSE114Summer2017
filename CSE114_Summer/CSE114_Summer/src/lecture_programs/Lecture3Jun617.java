package lecture_programs;

/**
 * 
 * @author Ben Michalowicz
 *
 */

public class Lecture3Jun617 {

	public static void main(String[] args) {
		char val = 'a';

		switch (val) {
		case 'a':
			System.out.println(val);
			break;
		case 'b':
			System.out.println(val);
			break;
		case 'c':
			System.out.println(val);
			break;
		default: System.out.println(val);
		}
		
		
		int i = 7;
		char grade = ' ';
		
		switch(i){
		case 9:
			case 8: grade = 'A'; break;
			case 7: 
			case 6: 
			case 5: grade = 'B'; break;
				default:grade = 'C';
		}
		
		System.out.println(grade);
	}

}
