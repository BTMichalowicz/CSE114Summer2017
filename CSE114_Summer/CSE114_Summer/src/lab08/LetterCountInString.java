package lab08;





//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 8, part 3: Counting Letters in a String
public class LetterCountInString {
    
    public static int countLetters(String s){
        int count = 0;
        if(s.length()==0) {
            return 0;
        }
        if(s==null) {
            return 0;
        }
        
        for(char c: s.toCharArray()){
            if(Character.isAlphabetic(c)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        System.out.println(countLetters("Java in 2017"));
    }
    
}
