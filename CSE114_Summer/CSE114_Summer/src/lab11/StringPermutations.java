package lab11;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 11: Part 4: String permuations

public class StringPermutations {

    public static void displayPermutation(String s) {

        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {

        if (s2.length() == 0) {
            System.out.println(s1);
        } else {
            for (int i = 0; i < s2.length(); i++) {
                displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));

            }
        }

    }
    
    public static void main(String[] args) {
        displayPermutation("12345678");
//        displayPermutation("ABC");
    }

}
