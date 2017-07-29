package finalProj;

/**
 *
 * @author Ben Michalowicz
 */
//Fodor's implementation of the project, cuz why not?
import java.util.*;

public class FodorGame {

    int[][] matrix = new int[6][6];

    private int carNumber = 1;
    private int round = 0;

    private static Scanner sc = new Scanner(System.in);

    public FodorGame() {
    }

    public boolean okCar(int car, int x, int y, int direction, int size) {

        boolean ok = true;

        if (direction == 1) {
            for (int i = y; i < y + size; i++) {
                if (i >= matrix.length || !(matrix[x][i] == 0 || matrix[x][i] == car)) {
                    ok = false;
                }

            }
        } else {
            for (int i = x; i < x + size; i++) {
                if (i >= matrix.length || !(matrix[i][y] == 0 || matrix[i][y] == car)) {
                    ok = false;
                }
            }
        }

        return ok;

    }

    public void putCar(int car, int x, int y, int direction, int size) {

        if (direction == 1) {
            for (int i = y; i < y + size; i++) {
                matrix[x][i] = car;
            }
        } else {
            for (int i = x; i < x + size; i++) {
                matrix[i][y] = car;
            }
        }
    }

    public void randomCars() {
        int i = 0;

        while (i < 5) {

            int size = (int)(2 * Math.random()) + 2;
            int direction = (int) (2 * Math.random()) + 1;
            int x, y;
            if (direction == 1) {
                x = (int) (matrix.length * Math.random());
                if (x == 2) {
                    x = 3;

                    y = (int) ((matrix.length - size) * Math.random());

                } else {
                    x = (int) ((matrix.length - size) * Math.random());
                    y = (int) (matrix.length * Math.random());
                }

                if (okCar(carNumber, x, y, direction, size)) {
                    putCar(carNumber, x, y, direction, size);
                    carNumber++;
                    i++;
                }
            }
        }

        System.out.println(gameToString());

    }

    public void initializeCars() {

        putCar(1, matrix.length / 2 - 1, 0, 1, 2);

        carNumber++;

        System.out.print("\nDo youwant to put the cars randomly? (y, n): ");

        char c = sc.next().charAt(0);

        if (c == 'y') {
            randomCars();
        } else {
            System.out.println("\nPlease place all the obstacles following the instructions\n");

            while (true) {
                System.out.println(gameToString());
                int size = 2;

                do {
                    System.out.print("Choose 2 for car, 3 for truck (1 to finish): ");
                    size = sc.nextInt();

                    if (size != 1 && size != 2 && size != 3) {
                        System.out.println("This is not a valid size, try again!!!!");
                    }
                } while (size != 1 && size != 2 && size != 3);

                if (size == 1) {
                    break;
                } else {
                    System.out.print("Choose 1 to set the vehicle horizontally, 2 for vertically");
                    int direction = sc.nextInt();
                    System.out.print("Please enter row, 1-6 (beginning of car)");
                    int x = sc.nextInt();
                    System.out.print("Please enter column, 1-6 (beginning of column");
                    int y = sc.nextInt();

                    if (!(okCar(carNumber, x, y, direction, size))) {
                        System.out.println("Not valid, please try again!");
                    } else {
                        putCar(carNumber, x, y, direction, size);
                        carNumber++;
                    }

                }
            }
        }
    }

    public String gameToString() {
        String s = new String("Game state: \n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (!(i == matrix.length / 2 && j == matrix[2].length - 1
                        || matrix[matrix.length / 2][matrix.length - 1] != 0)) {
                    s += matrix[i][j] + " ";
                } else {
                    s += "* ";
                }

            }

            s += "\n";
        }

        return s;
    }

    public void play() {

        System.out.println(gameToString());

        System.out.print("Choose a car: ");
        int car = sc.nextInt();
        System.out.print("Choose new x: ");
        int x = sc.nextInt() - 1;

        System.out.print("Choose new y: ");
        int y = sc.nextInt() - 1;
        System.out.print("Direction: ");
        int direction = sc.nextInt();

        System.out.print("Car size: ");
        int size = sc.nextInt();

        move(car, x, y, direction, size);

    }

    public void move(int car, int x, int y, int direction, int size) {

        if (!okCar(car, x, y, direction, size)) {
            System.out.println("This is not a valid position. try again");
        } else {

            int oldX = -1, oldY = -1;

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (oldX == -1 && matrix[i][j] == car) {
                        oldX = i;
                        oldY = j;
                    }

                }
            }

            putCar(0, oldX, oldY, direction, size);
            putCar(car, x, y, direction, size);
            round++;
        }
    }

    public boolean over() {
        if (round < 10 && !won()) {
            return false;

        }

        return true;
    }

    public boolean won() {

        return (matrix[matrix.length / 2 - 1][matrix.length - 1] == 1);
    }

    public static void main(String[] args) {

        System.out.println("The goal is to move the car number 1 to the * sign across all the obstacles.");

        FodorGame game = new FodorGame();
        game.initializeCars();

        System.out.println("Play the game: ");

        while (!game.over()) {
            game.play();
        }

        System.out.print("\nGame Over!\nThe results are IN!!: ");

        if (game.won()) {
            System.out.println("You win!! AWESOME!!! :)");
        } else {
            System.out.println("Sorry, you lost!");
        }

    }
}
