package midterm_exam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben Michalowicz
 */
public class EncryptCode {

    public static String encrypt1(String s) {

        String res = "";
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'y':
                    res += 'a';
                    break;
                case 'z':
                    res += 'b';
                    break;
                default:
                    res += (char) (c + 2); //type casting
                    break;
            }
        }
        return res;
    }

    public static String encrypt2(String s) {
        String res = "";
        char letter;
        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);

            if (letter > 122) {
                letter = (char) (letter - 122 + 96);
            }
            res += letter;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(encrypt2("abcdefxyz"));
    }

}
