package lecture_programs;

public class Test{
	public static void main(String[] args) {
		System.out.println("Welcome to CSE 114 (Java Programming)");
		
		for(int i = 0; i<3; i++)
			System.out.println("Welcome to CSE 114 (Java Programming)");
		
		
		//RECURSIVE ALGORITHMS
		printRecursion(3);

	}
	
	private static void printRecursion(int count){
		if(count>=0){
			System.out.println("Welcome to CSE 114 (Java Programming)");
			printRecursion(count-1);
		}else
			return;
	}
}