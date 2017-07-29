package homework3;


//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 3, Part 3: Pick 4 cards and calculate the sum of their values
public class PickFourCards {

    /**
     * Main method for execution
     *
     * @param args The parameter for the main method
     */
    public static void main(String[] args) {

        String[][] deck = new String[52][2];

        int count = 0;

        for (int i = 0; i < 4; i++) {
            String s = "";
            switch (i) {
                case 0:
                    s = "Hearts";
                    break;
                case 1:
                    s = "Diamonds";
                    break;
                case 2:
                    s = "Clubs";
                    break;
                case 3:
                    s = "Spades";
                    break;
            }

            for (int j = 0; j < 13; j++) {
                deck[count][0] = s;
                deck[count++][1] = j == 0 ? "Ace" : (j < 10 ? "" + j : (j == 10 ? "Jack" : (j == 11 ? "Queen" : "King")));
            }
        }

        int[] arr2 = new int[4];
        int j = 0, res = 0;

        while (j < arr2.length) {
            int i = (int) (Math.random() * deck.length);

            boolean hasSeen = false;

            for (int k = 0; k < j; k++) {
                if (arr2[k] == i) {
                    hasSeen = true;
                    break;
                }
            }

            if (hasSeen) {
                continue;
            }

            res += rankCheck(deck[i][1]);

            arr2[j] = i;
            System.out.println(deck[i][1] + " of " + deck[i][0]);
            j++;

        }

        System.out.println("Their sum is: " + res);

    }

    /**
     *
     * @param str A string representation of one of 52 cards from the given
     * static string array
     * @return the result of the given card's rank
     */
    public static int rankCheck(String str) {
        int result = 0;

        char specialCase = (char) (str.charAt(0) - '0');

        switch (str) {

            case "Ace":
                result = 14;
                break;
            case "King":
                result = 13;
                break;
            case "Queen":
                result = 12;
                break;
            case "Jack":
                result = 11;
                break;
            default:
                if (specialCase == '1') {
                    result = 10;
                } else {
                    result = str.charAt(0) - '0';
                }

        }

        return result;
    }

}
