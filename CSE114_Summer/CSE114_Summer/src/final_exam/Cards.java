package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class Cards {

    public static String[] sortCards(String[] s) {
        for (int i = 0; i < s.length; i++) {

            int minIndex = i;

            String curMin = s[i];

            for (int j = 0; j < i; j++) {

                if ((cardslessThan(curMin, s[j]))) {
                    curMin = s[j];
                    minIndex = j;

                }
                if (minIndex != i) {
                    s[minIndex] = s[i];
                    s[i] = curMin;
                }

            }

        }

        return s;
    }

    public static boolean cardslessThan(String s1, String s2) {

        char s1s = s1.charAt(s1.length() - 1);
        char s2s = s2.charAt(s2.length() - 1);

        if (s1s < s2s) {
            return true;
        } else if (s1s > s2s) {
            return false;
        }

        String n1 = s1.substring(0, s1.length() - 1);
        String n2 = s2.substring(0, s2.length() - 1);

        if (n1.equals("A") && !n2.equals("A")) {
            return true;
        } else if (n1.equals("2") && !n2.equals("A") && !n2.equals("2")) {
            return true;
        } else if (n1.equals("3") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3")) {
            return true;
        } else if (n1.equals("4") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4")) {
            return true;
        } else if (n1.equals("5") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5")) {
            return true;
        } else if (n1.equals("6") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6")) {
            return true;
        } else if (n1.equals("7") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7")) {
            return true;
        } else if (n1.equals("8") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8")) {
            return true;
        } else if (n1.equals("9") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8") && !n2.equals("9")) {
            return true;
        } else if (n1.equals("10") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8") && !n2.equals("9") && !n2.equals("10")) {
            return true;
        } else if (n1.equals("J") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8") && !n2.equals("9") && !n2.equals("10") && !n2.equals("J")) {
            return true;
        } else if (n1.equals("Q") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8") && !n2.equals("9") && !n2.equals("10") && !n2.equals("J") && !n2.equals("Q")) {
            return true;
        } else if (n1.equals("K") && !n2.equals("A") && !n2.equals("2") && !n2.equals("3") && !n2.equals("4") && !n2.equals("5") && !n2.equals("6") && !n2.equals("7") && !n2.equals("8") && !n2.equals("9") && !n2.equals("10") && !n2.equals("J") && !n2.equals("Q") && !n2.equals("K")) {
            return true;
        }

        return false;

    }

    public static void printArray(String[] arr) {

        System.out.print("[");

        for (String s : arr) {
            System.out.print(s + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        String[] s = {"8H", "10H", "QD", "JD", "4S", "2C"};

        printArray(sortCards(s));
    }

}
