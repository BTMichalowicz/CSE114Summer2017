package homework5;

//Benjamin Michalowicz (SBU ID: 110982339)
//Homework 5, Part 3: Recursive Addition

public class RecursiveAddition {
    public static void main(String[] args) {
        System.out.println(add(34, 44));
    }

    public static int add(int x, int y) {

        return add2(x, y, 1);
    }

    public static int add2(int x, int y, int counter) {
        if (counter <= y) {
            return add2(++x, y, ++counter);
        }
        return x;
    }

}
