package homework3;


// Benjamin Michalowicz (SBU ID: 110982339)
// Homework 3, Part 4: Coupon Collector's Problem Variation
public class CouponCollectorProblem {

    static String[] suits;

    public static void main(String[] args) {
        int numCount = 0;

        boolean spades = false, hearts = false, diamonds = false, clubs = false;

        String[] cardSeq = new String[4];
        int idx = 0;

        while (!spades || !hearts || !diamonds || !clubs) {
            String card = revealCard(getCard());
            numCount++;

            if (card.contains("Spades") && !spades) {
                cardSeq[idx++] = card;
                spades = true;
            } else if (card.contains("Hearts") && !hearts) {
                cardSeq[idx++] = card;
                hearts = true;
            } else if (card.contains("Diamonds") && !diamonds) {
                cardSeq[idx++] = card;
                diamonds = true;
            } else if (card.contains("Clubs") && !clubs) {
                cardSeq[idx++] = card;
                clubs = true;
            }

        }

        for (String s : cardSeq) {
            System.out.println(s);
        }
        System.out.println("Number of picks: " + numCount);

    }

    public static int getCard() {
        return (int) (Math.random() * 52); //For every card in the deck
    }

    public static String revealCard(int num) {

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int numSuit = num / 13; //Would return a remainder 0 through 3
        int numRank = num % 13; //The remainder, which would result in the number for the ranks

        return rank[numRank] + " of " + suits[numSuit];
    }

}
