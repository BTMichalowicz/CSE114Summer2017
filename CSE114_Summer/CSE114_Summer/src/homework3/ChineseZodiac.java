package homework3;


// Benjamin Michalowicz (SBU ID: 110982339)
//Homework 3, Part 2: Chinese Zodiac
import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");

        int year = input.nextInt();

        //The remainder of year divided by 12
        int mod = year % 12;

        //A switch statement to determine which statement to be printed out based
        //On the result of the modular arithmetic
        switch (mod) {

            case 0:
                System.out.print(year + " is the year of the monkey.");
                break;

            case 1:
                System.out.print(year + " is the year of the rooster.");
                break;
            case 2:
                System.out.print(year + " is the year of the dog.");
                break;
            case 3:
                System.out.print(year + " is the year of the pig.");
                break;
            case 4:
                System.out.print(year + " is the year of the rat.");
                break;
            case 5:
                System.out.print(year + " is the year of the ox.");
                break;
            case 6:
                System.out.print(year + " is the year of the tiger.");
                break;
            case 7:
                System.out.print(year + " is the year of the rabbit.");
                break;
            case 8:
                System.out.print(year + " is the year of the dragon.");
                break;
            case 9:
                System.out.print(year + " is the year of the snake.");
                break;
            case 10:
                System.out.print(year + " is the year of the horse.");
                break;
            case 11:
                System.out.print(year + " is the year of the sheep.");
                break;
        }

        input.close();
    }

}
