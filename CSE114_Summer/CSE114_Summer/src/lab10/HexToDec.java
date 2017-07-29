package lab10;


//Benjaamin Michalowicz (SBU ID: 110982339)
//Lab 10, Part3: HexFormat Exception

import java.util.Scanner;

public class HexToDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal string: ");

        String hex = sc.next();
        try {
            System.out.println("Its decimal equicalent is " + parseHex(hex));
        } catch (HexFormatException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public static int parseHex(String hex) throws HexFormatException {

        int result = 0;
        //Checking for legality
        for (char c : hex.toCharArray()) {

            if (!('0' <= c && c <= '9') && !('A' <= c && c <= 'F') && !('a' <= c && c <= 'f')) {
                throw new HexFormatException("Illegal Hexadecimal String");

            }

        }

        for (char c : hex.toCharArray()) {
            result = result * 16 + digitHex(c);
        }

        return result;
    }

    public static int digitHex(char h) throws HexFormatException{
        if ('0' <= h && h <= '9') {
            return h - '0';
        } else if('A'<=h && h<='F'){
            return h - 'A' + 10;
        }else if ('a'<=h && h<='f'){
            return h - 'a' + 10;
        }
        throw new HexFormatException("Not a hex number");
    }

}

class HexFormatException extends Exception {

    public HexFormatException(String message) {
        super(message);
    }

}
