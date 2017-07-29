package lecture_programs;

public class RandomTest {
	
	public static void main(String[] args) {
		char c = (char)('a'+Math.random() * ('z'-'a' + 1));
		//(Lower bound + Math.random * (Higher bound - lower bound + 1))
		System.out.println(c);
		
		char a = 'a';
		
		System.out.println(Character.isAlphabetic(a)?a:"");
		//(('a'<=c && c<='z') || ('A'<=c && c<='Z'))
		
		
		char b = '5'; //('0' <=a && a<='9')
		
		System.out.println(Character.isDigit(5)?b:"Not a number");
		
		
		
		
		//To generate radno
	}

}
