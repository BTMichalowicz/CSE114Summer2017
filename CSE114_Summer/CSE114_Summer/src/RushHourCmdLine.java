
//Benjamin Michalowicz(SBU ID: 110982339)
//Final Project: Rush Hour: Command-Line version
import java.util.Scanner;

public class RushHourCmdLine {

    private static void printBoard() {
        for (int q = 0; q < table.length; q++) {
            for (int w = 0; w < table.length; w++) {

                if (w == 0) {
                    System.out.print("Row " + q + "\t");
                }
                System.out.print(table[q][w] + " ");

            }
            if (q == 2) {
                System.out.println("  <--- Exit here");
            } else {
                System.out.println();
            }

        }

        System.out.println("\n");
    }

    static int[][] table = new int[6][6];

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Rush Hour, a variant by Benjamin Michalowicz"
                    + "\n----------------------------------------------------------------------------");
            System.out.print("Enter a number to read the rules(1), play the game(2), or exit(3): ");

            int answer = sc.nextInt();

            while (answer != 2 && answer != 3) {

                if (answer == 1) {
                    printRules();
                } else {
                    System.out.println("Bad input, please try again");
                }
                System.out.print("Enter a number to read the rules(1), play the game(2), or exit(3): ");
                answer = sc.nextInt();
            }

            switch (answer) {
                case 2:
                    start();
                    break;

                case 3:
                    System.out.println("Goodbye, have a nice day!");

                    System.exit(0);
                    break;
            }
        }
    }

    private static void printRules() {
        System.out.println();
        String rules = "(Rules taken from Dr. Fodor's BlackBoard page)\nThe game starts 4 cars and 2 trucks initialized by the user on a 6x6 grid."
                + "\nTrucks take up 3 squares, and cars take up 2 squares. Their positions can only be in a straight line, vertical or horizontal."
                + "\nThe goal is to get the car in line with the exit row through the end of said board by moving vehicles (on their respective grid lines) to accomodate for the car's passage."
                + "\nIf a user tries something against these rules, they lose a turn."
                + "\nPlayers are only allowed 10 turns. If the game cannot be finished within that amount of turns, game over."
                + "\nBest of luck!\n";
        System.out.println(rules);
    }

    static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter either a 1 for user-defined input or a 2 for randomized board setup: ");

        int choice;
        choice = sc.nextInt();

        while (true) {

            if (choice != 1 && choice != 2) {
                System.out.println("Bad input; please try again:\n");
                System.out.print("Enter either a 1 for user-defined input or a 2 for randomized board setup: ");
                choice = sc.nextInt();
            } else if (choice == 1 | choice == 2) {
                break;
            }

        }

        switch (choice) {
            case 1:
                userBoard();
                break;
            case 2:
                randomBoard();
                break;

        }

    }

    static void userBoard() {

        System.out.println("Welcome to the user input variant!\n");

        Scanner sc = new Scanner(System.in);

        int truck1x = 0, truck1y = 0; //vertical
        int truck2x = 0, truck2y = 0; //horizontal
        int car1x = 0, car1y = 0; //vertical
        int car2x = 0, car2y = 0; //horizontal
        int car3x = 0, car3y = 0; //vertical
        int mainX = 2, mainY = 1; //horizontal, obviously.

        int choice;

        int numVertical = 0, numHorizontal = 0;

        System.out.println("This board has 0 based indexes, so the 6th row is is associated with row #5, for example. \n\n");

        table[mainX][mainY] = 7;
        table[mainX][mainY - 1] = 7;
        numHorizontal++;

        System.out.println("The board starts as follows:");
        printBoard();

        System.out.print("Now enter the coordinates for the first truck. Enter if you want it to be vertical (1) or horizontal (2) : ");

        choice = sc.nextInt();

        while (choice != 1 && choice != 2) {

            if (numHorizontal == 3) {
                System.out.println("No more than 3 horizontal vehicles. Now oving to vertical car selection...");
                choice = 2;
                break;
            } else if (numVertical == 3) {
                System.out.println("No more than 3 vertical vehicles. Now moving to horizontal car selection...");
                choice = 1;
                break;
            }

            System.out.println("Bad input, please try again: \n");

            System.out.print("Enter if you want the first truck to be oriented vertically (1) or horizontally (2) : ");
            choice = sc.nextInt();
        }

        switch (choice) {

            case 1:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the truck; the rest will follow going up the board (so, x-coordinate -1 and x-coordinate-2): ");
                    truck1x = sc.nextInt();
                    truck1y = sc.nextInt();

                    if (truck1x >= table.length || truck1x < 0 || truck1y >= table.length || truck1y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if (truck1y >= 2) {

                        if (truck1x >= 2) {
                            System.out.println("Good coordinates!\n");
                            table[truck1x][truck1y] = 1;
                            table[truck1x - 1][truck1y] = 1;
                            table[truck1x - 2][truck1y] = 1;

                            numVertical++;

                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;
                        }
                    } else if (truck1y < 2) {
                        if (truck1x == 5) {
                            System.out.println("Good coordinates!\n");
                            table[truck1x][truck1y] = 1;
                            table[truck1x - 1][truck1y] = 1;
                            table[truck1x - 2][truck1y] = 1;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    } else {
                        System.out.println("These are bad coordinates, please try again:\n");
                    }
                }

                break;

            case 2:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the truck; the rest will follow going to the left of the board (so, y-coordinate -1 and y-coordinate-2): ");
                    truck1x = sc.nextInt();
                    truck1y = sc.nextInt();

                    if (truck1x >= table.length || truck1x < 0 || truck1y >= table.length || truck1y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if (truck1x == 2) {
                        System.out.println("Horizontal vehicles cannot be in the same line as the main car. Try again.\n");
                    } else {
                        if (truck1y < 2) {
                            System.out.println("Because the rest of the truck falls behind the coordinates, you are going off the board. Try again.\n");
                        } else {
                            System.out.println("Good coordinates!\n");
                            table[truck1x][truck1y] = 1;
                            table[truck1x][truck1y - 1] = 1;
                            table[truck1x][truck1y - 2] = 1;
                            numHorizontal++;
                            System.out.println("The updated board is as follows:");
                            printBoard();

                            break;

                        }
                    }

                }

                break;

        }

        System.out.print("Now enter the coordinates for the second truck. Enter if you want it to be vertical (1) or horizontal (2) : ");

        choice = sc.nextInt();

        while (choice != 1 && choice != 2) {

            if (numHorizontal == 3) {
                System.out.println("No more than 3 horizontal vehicles. Now oving to vertical car selection...");
                choice = 2;
                break;
            } else if (numVertical == 3) {
                System.out.println("No more than 3 vertical vehicles. Now moving to horizontal car selection...");
                choice = 1;
                break;
            }

            System.out.println("Bad input, please try again: \n");

            System.out.print("Enter if you want the first truck to be oriented vertically (1) or horizontally (2) : ");
            choice = sc.nextInt();
        }

        switch (choice) {

            case 1:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the truck; the rest will follow going up the board (so, x-coordinate -1 and x-coordinate-2): ");
                    truck2x = sc.nextInt();
                    truck2y = sc.nextInt();

                    if (truck2x >= table.length || truck2x < 0 || truck2y >= table.length || truck2y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[truck2x][truck2y] != 0) && (table[truck2x - 1][truck2y] != 0) && (table[truck2x - 2][truck2y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[truck2x][truck2y] != 0) || (table[truck2x - 1][truck2y] != 0) || (table[truck2x - 2][truck2y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (truck2y >= 2) {

                        if (truck2y >= 2) {
                            System.out.println("Good coordinates!\n");
                            table[truck2x][truck2y] = 2;
                            table[truck2x - 1][truck2y] = 2;
                            table[truck2x - 2][truck2y] = 2;
                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;
                        }
                    } else if (truck1y < 2) {
                        if (truck1x == 5) {
                            System.out.println("Good coordinates!\n");
                            table[truck2x][truck2y] = 2;
                            table[truck2x - 1][truck2y] = 2;
                            table[truck2x - 2][truck2y] = 2;
                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    } else {
                        System.out.println("These are bad coordinates, please try again:\n");
                    }
                }

                break;

            case 2:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the truck; the rest will follow going to the left of the board (so, y-coordinate -1 and y-coordinate-2): ");
                    truck2x = sc.nextInt();
                    truck2y = sc.nextInt();

                    if (truck1x >= table.length || truck1x < 0 || truck1y >= table.length || truck1y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if (truck2x == truck1x && truck2y == truck1y || (truck2x == truck1x && truck2y == truck1y - 1) || (truck2x == truck1x && truck2y == truck1y - 2)) {
                        System.out.println("You can't overlap trucks.");
                        continue;

                    }

                    if ((table[truck2x][truck2y] != 0) && (table[truck2x][truck2y - 1] != 0) && (table[truck2x][truck2y - 2] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[truck2x][truck2y] != 0) || (table[truck2x][truck2y - 1] != 0) || (table[truck2x][truck2y - 2] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (truck2x == 2) {
                        System.out.println("Horizontal vehicles cannot be in the same line as the main car. Try again.\n");
                    } else {
                        if (truck2y < 2) {
                            System.out.println("Because the rest of the truck falls behind the coordinates, you are going off the board. Try again.\n");
                        } else {
                            System.out.println("Good coordinates!\n");
                            table[truck2x][truck2y] = 2;
                            table[truck2x][truck2y - 1] = 2;
                            table[truck2x][truck2y - 2] = 2;
                            numHorizontal++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    }

                }

                break;

        }

        System.out.print("Now enter the coordinates for the first non-main car. Enter if you want it to be vertical (1) or horizontal (2) : ");

        choice = sc.nextInt();

        while (choice != 1 && choice != 2) {

            if (numHorizontal == 3) {
                System.out.println("No more than 3 horizontal vehicles. Now oving to vertical car selection...");
                choice = 2;
                break;
            } else if (numVertical == 3) {
                System.out.println("No more than 3 vertical vehicles. Now moving to horizontal car selection...");
                choice = 1;
                break;
            }

            System.out.println("Bad input, please try again: \n");

            System.out.print("Enter if you want the first non-main car to be oriented vertically (1) or horizontally (2) : ");
            choice = sc.nextInt();
        }

        switch (choice) {

            case 1:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the truck; the rest will follow going up the board (so, x-coordinate - 1): ");
                    car1x = sc.nextInt();
                    car1y = sc.nextInt();

                    if (car1x >= table.length || car1x < 0 || car1y >= table.length || car2y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car1x][car1y] != 0) && (table[car1x - 1][car1y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car1x][car1y] != 0) || (table[car1x - 1][car1y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car1x == truck1x && car1y == truck1y || (car1x == truck1x - 1 && car1y == truck1y) || (car1x == truck1x - 2 && car1y == truck1y)
                            || (car1x == truck2x && car1y == truck2y || (car1x == truck2x - 1 && car1y == truck2y) || (car1x == truck2x - 2 && car1y == truck2y))) {
                        System.out.println("You can't overlap vehicles.");
                        continue;

                    }

                    if (car1y >= 2) {

                        if (car1y >= 2) {
                            System.out.println("Good coordinates!\n");
                            table[car1x][car1y] = 3;
                            table[car1x - 1][car1y] = 3;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;
                        }
                    } else if (car1y < 2) {
                        if (car1x == 5 || car1x == 4 || car1x == 1) {
                            System.out.println("Good coordinates!\n");
                            table[car1x][car1y] = 2;
                            table[car1x - 1][car1y] = 2;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    } else {
                        System.out.println("These are bad coordinates, please try again:\n");
                    }
                }

                break;

            case 2:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the car; the rest will follow going to the left of the board (so, y-coordinate -1): ");
                    car1x = sc.nextInt();
                    car1y = sc.nextInt();

                    if (car1x >= table.length || car1x < 0 || car1y >= table.length || car1y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car1x][car1y] != 0) && (table[car1x][car1y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car1x][car1y] != 0) || (table[car1x][car1y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car1x == truck1x && car1y == truck1y || (car1x == truck1x && car1y == truck1y - 1) || (car1x == truck1x && car1y == truck1y - 2)
                            || (car1x == truck2x && car1y == truck2y || (car1x == truck2x - 1 && car1y == truck2y) || (car1x == truck2x - 2 && car1y == truck2y))) {
                        System.out.println("You can't overlap vehicles.");
                        continue;

                    }

                    if (car1x == 2) {
                        System.out.println("Horizontal vehicles cannot be in the same line as the main car. Try again.\n");
                    } else {
                        if (car1y < 2) {
                            System.out.println("Because the rest of the truck falls behind the coordinates, you are going off the board. Try again.\n");
                        } else {
                            System.out.println("Good coordinates!\n");
                            table[car1x][car1y] = 3;
                            table[car1x][car1y - 1] = 3;

                            numHorizontal++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    }

                }

                break;

        }

        System.out.print("Now enter the coordinates for the second non-main car. Enter if you want it to be vertical (1) or horizontal (2) : ");

        choice = sc.nextInt();

        while (choice != 1 && choice != 2) {

            if (numHorizontal == 3) {
                System.out.println("No more than 3 horizontal vehicles. Now oving to vertical car selection...");
                choice = 2;
                break;
            } else if (numVertical == 3) {
                System.out.println("No more than 3 vertical vehicles. Now moving to horizontal car selection...");
                choice = 1;
                break;
            }

            System.out.println("Bad input, please try again: \n");

            System.out.print("Enter if you want the second non-main car to be oriented vertically (1) or horizontally (2) : ");
            choice = sc.nextInt();
        }

        switch (choice) {

            case 1:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the car; the rest will follow going up the board (so, x-coordinate -1): ");
                    car2x = sc.nextInt();
                    car2y = sc.nextInt();

                    if (car2x >= table.length || car2x < 0 || car2y >= table.length || car2y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car2x][car2y] != 0) && (table[car2x - 1][car2y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car2x][car2y] != 0) || (table[car2x - 1][car2y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car2x == truck1x && car2y == truck1y || (car2x == truck1x - 1 && car2y == truck1y) || (car2x == truck1x - 2 && car2y == truck1y)
                            || (car2x == truck2x && car2y == truck2y || (car2x == truck2x - 1 && car2y == truck2y) || (car2x == truck2x - 2 && car2y == truck2y))) {
                        System.out.println("You can't overlap vehicles.");
                        continue;

                    }

                    if (car2y >= 2) {

                        if (car2y >= 2) {
                            System.out.println("Good coordinates!\n");
                            table[car2x][car2y] = 4;
                            table[car2x - 1][car2y] = 4;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;
                        }
                    } else if (car2y < 2) {
                        if (car2x == 5 || car2x == 4 || car2x == 1) {
                            System.out.println("Good coordinates!\n");
                            table[car2x][car2y] = 4;
                            table[car2x - 1][truck2y] = 4;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    } else {
                        System.out.println("These are bad coordinates, please try again:\n");
                    }
                }

                break;

            case 2:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the car; the rest will follow going to the left of the board (so, y-coordinate -1): ");
                    car2x = sc.nextInt();
                    car2y = sc.nextInt();

                    if (car2x >= table.length || car2x < 0 || car2y >= table.length || car2y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car2x][car2y] != 0) && (table[car2x][car2y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car2x][car2y] != 0) || (table[car2x][car2y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car2x == 2) {
                        System.out.println("Horizontal vehicles cannot be in the same line as the main car. Try again.\n");
                    } else {
                        if (car2y < 2) {
                            System.out.println("Because the rest of the truck falls behind the coordinates, you are going off the board. Try again.\n");
                        } else {
                            System.out.println("Good coordinates!\n");
                            table[car2x][car2y] = 4;
                            table[car2x][car2y - 1] = 4;

                            numHorizontal++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    }

                }

                break;

        }

        System.out.print("Now enter the coordinates for the last non-main car. Enter if you want it to be vertical (1) or horizontal (2) : ");

        choice = sc.nextInt();

        while (choice != 1 && choice != 2) {

            if (numHorizontal == 3) {
                System.out.println("No more than 3 horizontal vehicles. Now oving to vertical car selection...");
                choice = 2;

                break;
            } else if (numVertical == 3) {
                System.out.println("No more than 3 vertical vehicles. Now moving to horizontal car selection...");
                choice = 1;
                break;
            }

            System.out.println("Bad input, please try again: \n");

            System.out.print("Enter if you want the last non-main car to be oriented vertically (1) or horizontally (2) : ");
            choice = sc.nextInt();
        }

        switch (choice) {

            case 1:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the car; the rest will follow going up the board (so, x-coordinate -1): ");
                    car3x = sc.nextInt();
                    car3y = sc.nextInt();

                    if (car3x >= table.length || car3x < 0 || car3y >= table.length || car3y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car3x][car3y] != 0) && (table[car3x - 1][car3y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car3x][car3y] != 0) || (table[car3x - 1][car3y] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car3y >= 2) {

                        if (car3y >= 2) {
                            System.out.println("Good coordinates!\n");
                            table[car3x][car3y] = 5;
                            table[car3x - 1][car3y] = 5;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;
                        }
                    } else if (car3y < 2) {
                        if (car3x == 5 || car3x == 4 || car3x == 1) {
                            System.out.println("Good coordinates!\n");
                            table[car3x][car3y] = 5;
                            table[car3x - 1][car3y] = 5;

                            numVertical++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    } else {
                        System.out.println("These are bad coordinates, please try again:\n");
                    }
                }

                break;

            case 2:

                while (true) {
                    System.out.print("Enter the coordinates for the head of the car; the rest will follow going to the left of the board (so, y-coordinate -1 and y-coordinate-2): ");
                    car3x = sc.nextInt();
                    car3y = sc.nextInt();

                    if (car3x >= table.length || car3x < 0 || car3y >= table.length || car3y < 0) {
                        System.out.println("Try again: Your vehicle will be off the board");
                        continue;
                    }

                    if ((table[car3x][car3y] != 0) && (table[car3x][car3y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }
                    if ((table[car3x][car3y] != 0) || (table[car3x][car3y - 1] != 0)) {
                        System.out.println("Something exists in these spots, try again.\n");
                        continue;
                    }

                    if (car3x == 2) {
                        System.out.println("Horizontal vehicles cannot be in the same line as the main car. Try again.\n");
                    } else {
                        if (car3y < 2) {
                            System.out.println("Because the rest of the truck falls behind the coordinates, you are going off the board. Try again.\n");
                        } else {
                            System.out.println("Good coordinates!\n");
                            table[car3x][car3y] = 5;
                            table[car3x][car3y - 1] = 5;

                            numHorizontal++;
                            System.out.println("The updated board is as follows:");
                            printBoard();
                            break;

                        }
                    }

                }
                break;

        }

        System.out.println("The board is all set up and is as follows: ");

        printBoard();

        System.out.println("Let's play!\n");

        playGame(truck1x, truck1y, truck2x, truck2y, car1x, car1y, car2x, car2y, car3x, car3y, mainX, mainY);
    }

    static void randomBoard() {

        //GamePlay
        //Truck 1: Horizontal,
        int loop1, loop2, loop3, loop4, loop5;

        loop1 = loop2 = loop3 = loop4 = loop5 = 0;
        String s = "This variant uses a randomized setup, and the car oriented towards the exit has already been assigned on the board.\n";

        System.out.println(s);
        int truck1x, truck1y; //Truck 1: Vertical
        int truck2x, truck2y; //Truck 2: Horizontal
        int car1x, car1y; //Car 1: Vertical
        int car2x, car2y; //Car 2: Horizontal
        int car3x, car3y; //Car 3: Vertical
        int mainX = 2, mainY = 1; //Main car: Horizontal

        table[mainX][mainY] = 7;
        table[mainX][mainY - 1] = 7;

        System.out.println("Setting up truck 1...");

        while (true) { //Vertical truck 1
            truck1x = 2 + (int) (Math.random() * 4);
            truck1y = (int) (Math.random() * table.length);

            if (truck1y > 2) {
                System.out.println("No errors: Good to go!");
                table[truck1x][truck1y] = 1;
                table[truck1x - 1][truck1y] = 1;
                table[truck1x - 2][truck1y] = 1;
                break;
            } else if (truck1y < 2) {
                if (truck1x == 5) {
                    System.out.println("No errors: Good to go!");
                    table[truck1x][truck1y] = 1;
                    table[truck1x - 1][truck1y] = 1;
                    table[truck1x - 2][truck1y] = 1;
                    break;

                }
            }

            loop1++;

            if (loop1 > 5000) {
                System.out.println("Error in loop 1... moving on\n");

                break;
            }

        }

        System.out.println("\nSetting up truck 2...");

        //Horizontal truck 2
        while (true) {
            truck2x = (int) (Math.random() * table.length);
            truck2y = (int) (Math.random() * (table.length - 2));

            if (truck2x != 2) {
                if (truck2x != truck1x && truck2x != truck1x - 1 && truck2x != truck1x - 2 && truck2y != truck1y && truck2y > 2) {
                    System.out.println("No errors: Good to go!");
                    table[truck2x][truck2y] = 2;
                    table[truck2x][truck2y + 1] = 2;
                    table[truck2x][truck2y + 2] = 2;
                    break;
                }
            }

            loop2++;

            if (loop2 > 5000000) {

                System.out.println("Error in loop 2... moving on\n");
                break;
            }
        }

        //Vertical Car 1
        System.out.println("\nSetting up car 1...");

        while (true) {
            car1x = (int) (Math.random() * 5);
            car1y = (int) (Math.random() * table.length);

            if (car1y > 1) {

                if (car1x != truck2x && car1x != truck1x && car1y != truck2y && car1y != truck1y && car1y != truck2y + 1 && car1y != truck1y + 2 && car1x + 1 != truck2y + 2) {
                    System.out.println("No errors: Good to go!");
                    table[car1x][car1y] = 3;
                    table[car1x + 1][car1y] = 3;
                    break;
                } else if (car1y < 2) {
                    if (car1x > 2 && car1x != truck2x && car1x != truck1x && car1y != truck2y && car1y != truck1y && car1y != truck2y + 1 && car1y != truck1y + 2 && car1x + 1 != truck2y + 2) {
                        System.out.println("No errors: Good to go!");
                        table[car1x][car1y] = 3;
                        table[car1x + 1][car1y] = 3;
                        break;
                    }

                }
            }

            loop3++;

            if (loop3 > 5000000) {

                System.out.println("Error in loop 3... moving on\n");
                break;
            }
        }

        //Horizontal Car 2
        System.out.println("\nSetting up car 2...");

        while (true) {
            car2x = (int) (Math.random() * (table.length - 1));
            car2y = (int) (Math.random() * table.length);

            if (car2x != 2) {

                if (car2y + 1 < table.length && car2y + 1 != truck1y && car2y != truck1y - 2 && car2x != car1x && car2y != truck1y && car2y + 1 != truck2y && car2y + 1 != car1x + 1) {
                    System.out.println("No errors: Good to go!");
                    table[car2x][car2y] = 4;
                    table[car2x][car2y + 1] = 4;
                    break;
                }

            }

            loop4++;

            if (loop4 > 5000000) {

                System.out.println("Error in loop 4... moving on\n");
                break;
            }
        }

        //Vertical Car 3:
        System.out.println("\nSetting up car 3...");

        while (true) {
            car3x = (int) (Math.random() * (table.length - 1));
            car3y = (int) (Math.random() * table.length);

            if (car3y > 2) {

                if (car3x != car2x && car3y != car2y && (car3x + 1) < table.length && car3y != truck2y && car3y != truck2y + 1 && car3x != truck2y + 2 && car3y != truck1y + 2
                        && car3x + 1 != truck1x && car3x + 1 != truck1x + 1 && car3x + 1 != car2y && car3y != truck1y && truck2y + 2 != car3y && car3x + 1 != car2x && car3y != car2x && car3y != car2x + 1 && car3y != car2y + 1) {
                    System.out.println("No errors: Good to go!");
                    table[car3x][car3y] = 5;
                    table[car3x + 1][car3y] = 5;
                    break;
                }

            } else if (car3y < 2) {
                if ((car3x == 0 && car3x != car2y) || ((car3x > 2) && car3x != car2x && car3x != car2y && car3x != truck1x && (car3y != truck1y && car3y != truck1y + 1 && car3y != truck1y + 2 && car3x + 1 != car2y + 1))) {
                    System.out.println("No errors: Good to go!");
                    table[car3x][car3y] = 5;
                    table[car3x + 1][car3y] = 5;
                    break;
                }
            }

            loop5++;

            if (loop5 > 5000001) {

                System.out.println("Error in loop 5... moving on\n");
                break;
            }

        }

        // The 4th car is the car denoted with the number "7", and is horizontal (already been declared some 50 lines of code ago
//        if(error){
//            System.out.println("Error; must go debug");
//
//        }else {
        System.out.println("All cars are set up: Here is the board: \n");

        printBoard();

        System.out.println("All cars are ready, let's play!");

        System.out.println("-------------------------------------------------------------------------------\n");
//
        playGame(truck1x, truck1y, truck2x, truck2y, car1x, car1y, car2x, car2y, car3x, car3y, mainX, mainY);

    }

    private static final String CAR1 = "car1", CAR2 = "car2", CAR3 = "car3", TRUCK1 = "truck1", TRUCK2 = "truck2", MAIN = "main"; //Basically to save efficiency. If the user doesn't correctly enter their choice of car, they just have to keep
    //Entering choices until they enter the correct car. No penalties towards maximum turn limit here at least.

    private static void playGame(int truck1x, int truck1y, int truck2x, int truck2y, int car1x, int car1y,
            int car2x, int car2y, int car3x, int car3y, int mainCarx, int mainCary) {

        Scanner sc = new Scanner(System.in);

        String s;

        int turnCount = 0; //Starting turn number for the game

        while (turnCount < 9) {

            try {
                System.out.println("Turn number: " + (turnCount + 1));

                System.out.print("Choose a car (car1, car2, car3), truck (truck1, truck2), or the main car (main); enter one"
                        + " of the choices in parentheses (or you can type in \"exit\" and exit the game): ");
                s = sc.next();

                while (!(s.equals(TRUCK1)) && !(s.equals(TRUCK2)) && !(s.equals(CAR1)) && !(s.equals(CAR2)) && !(s.equals(CAR3))
                        && !(s.equals(MAIN)) && !s.equalsIgnoreCase("exit")) {

                    System.out.println("\nBad input, choose again:\n");
                    System.out.print("Choose a car (car1, car2, car3), truck (truck1, truck2), or the main car (main); enter one"
                            + " of the choices in parentheses (or you can type in \"exit\" and exit the game): ");
                    s = sc.next();
                }

                int x, y; //coordinate declarations for each case

                switch (s) {
                    case TRUCK1: //Vertical

                        System.out.print("\nEnter coordinates for the truck to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new ArrayIndexOutOfBoundsException("Negative coordinates");
                        }
                        if (y != truck1y) {
                            throw new IllegalArgumentException("This truck only moves left and right.");
                        }
                        if ((table[x][y] != 1 && table[x][y] != 0)) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if (((((x == truck1x))))) {
                            throw new IllegalArgumentException("You're not moving at all!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the gameboard!");
                        }

                        //Something about shifting the array within the matrix.
                        if (x > truck1x) {

                            for (int i = truck1x + 1; i <= y; i++) {
                                if (table[x][i] != 0 && table[x][i] != 1) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }

                            int temp = table[truck1x - 2][truck1y];
                            int temp2 = table[truck1x - 1][truck1y];
                            int temp3 = table[truck1x][truck1y];
                            while (truck1x <= x && truck1x + 1 <= x) {
                                table[truck1x - 1][truck1y] = temp;
                                table[truck1x][truck1y] = temp2;
                                table[truck1x + 1][truck1y] = temp3;

                                table[truck1x - 2][truck1y] = 0;
                                truck1x++;

                            }
                        }

                        if (x < (truck1x - 2) && (x >= 0)) {

                            for (int i = truck1x - 3; i >= y; i--) {
                                if (table[x][i] != 0 && table[x][i] != 1) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            //shift the array backwards now!!
                            int temp = table[truck1x][truck1y];
                            int temp2 = table[truck1x - 1][truck1y];
                            int temp3 = table[truck1x - 2][truck1y];

                            while (truck1x - 2 >= x && (truck1x - 3) >= x && (truck1x - 2 >= 0 && truck1x - 3 >= 0)) {
                                table[truck1x - 1][truck1y] = temp;
                                table[truck1x - 3][truck1y] = temp3;
                                table[truck1x - 2][truck1y] = temp2;

                                table[truck1x][truck1y] = 0;
                                truck1x--;
                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();

                        break;
                    case TRUCK2: //Horizontal //One down, five to go!!!

                        System.out.print("Enter coordinates for the truck to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new IllegalArgumentException("Negative coordinates.");
                        }
                        if (x != truck2x) {
                            throw new IllegalArgumentException("This truck only moves up and down.");
                        }
                        if (table[x][y] != 0) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if (y == truck2y || y == truck2y + 1 || y == truck2y + 2) {
                            throw new IllegalArgumentException("You're not moving anywhere!!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the game-board!");
                        }

                        //This if statement and the one below it shift the numbers belonging to truck2 (ideally, any index with a "2" in it) either left or right.
                        /*
                        Temporary variables are used to keep track of swapping, although direct shifting would probably be a bit better...

                        NAH, this makes things cleaner for me
                         */
                        if (y < truck2y) {

                            for (int i = truck2y - 1; i >= y; i--) {
                                if (table[x][y] != 0 && table[i][y] != 2) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[truck2x][truck2y];
                            int temp2 = table[truck2x][truck2y + 1];
                            int temp3 = table[truck2x][truck2y + 2];
                            while (truck2y >= y && truck2y - 1 >= y) {
                                table[truck2x][truck2y - 1] = temp;
                                table[truck2x][truck2y] = temp2;
                                table[truck2x][truck2y + 1] = temp3;

                                table[truck2x][truck2y + 2] = 0;
                                truck2y--;

                            }
                        }

                        if (y > truck2y + 2) {

                            for (int i = truck2y + 3; i <= y; i++) {
                                if (table[x][i] != 0 && table[x][i] != 2) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[truck2x][truck2y];
                            int temp2 = table[truck2x][truck2y + 1];
                            int temp3 = table[truck2x][truck2y + 2];
                            while (truck2y + 2 <= y && truck2y + 3 <= y) {
                                table[truck2x][truck2y + 1] = temp;
                                table[truck2x][truck2y + 2] = temp2;
                                table[truck2x][truck2y + 3] = temp3;

                                table[truck2x][truck2y] = 0;
                                truck2y++;

                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();
                        break;

                    case CAR1: //Vertical

                        System.out.print("\nEnter coordinates for the car to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new IllegalArgumentException("Negative coordinates");
                        }
                        if (y != car1y) {
                            throw new IllegalArgumentException("This car only moves up and down.");
                        }
                        if (table[x][y] != 0 && table[x][y] != 3) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if ((x == car1x)) {
                            throw new IllegalArgumentException("You're not moving at all!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the gameboard!");
                        }

                        //Something about shifting the array within the matrix.
                        if (x > car1x + 1) {

                            for (int i = car1x + 2; i <= x; i++) {
                                if (table[i][y] != 0 && table[i][y] != 3) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[car1x][car1y];
                            int temp2 = table[car1x + 1][car1y];

                            while (car1x + 1 <= x && car1y + 2 <= x) {

                                table[car1x + 1][car1y] = temp;
                                table[car1x + 2][car1y] = temp2;

                                table[car1x][car1y] = 0;
                                car1x++;

                            }
                        }

                        if (x < (car1x)) {

                            for (int i = car1x - 1; i >= x; i--) {
                                if (table[i][y] != 0 && table[i][y] != 3 || table[i][y + 1] != 0 && table[i][y + 1] != 3) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            //shift the array backwards now!!
                            int temp = table[car1x][car1y];
                            int temp2 = table[car1x + 1][car1y];

                            while (car1x - 1 >= x && (car1x - 1) >= x & (car1x - 1) >= 0) {
                                table[car1x - 1][car1y] = temp;

                                table[car1x][car1y] = temp2;

                                table[car1x + 1][car1y] = 0;
                                car1x--;
                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();

                        break;

                    case CAR2: //Horizontal

                        System.out.print("Enter coordinates for the car to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new IllegalArgumentException("Negative coordinates.");
                        }
                        if (x != car2x) {
                            throw new IllegalArgumentException("This car only moves left and right.");
                        }

                        if ((table[x][y] != 0 && table[x][y] != 4)) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if (y == car2y) {
                            throw new IllegalArgumentException("You're not moving anywhere!!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the game-board!");
                        }

                        //This if statement and the one below it shift the numbers belonging to truck2 (ideally, any index with a "2" in it) either left or right.
                        /*
                        Temporary variables are used to keep track of swapping, although direct shifting would probably be a bit better...

                        NAH, this makes things cleaner for me
                         */
                        if (y < car2y) {

                            for (int i = car2y - 1; i >= y; i--) {
                                if (table[x][i] != 0 && table[x][i] != 4 || table[x][i + 1] != 0 && table[x][i + 1] != 4 && i + 1 < table.length) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[car2x][car2y + 1];
                            int temp2 = table[car2x][car2y];

                            while (car2y >= y && car2y - 1 >= y && car2y - 1 >= 0) {
                                table[car2x][car2y] = temp;
                                table[car2x][car2y - 1] = temp2;

                                table[car2x][car2y + 1] = 0;
                                car2y--;

                            }
                        }

                        if (y > car2y + 1) {

                            for (int i = car2y + 2; i <= y; i++) {
                                if (table[x][i] != 0 && table[x][i] != 4 || table[x][i + 1] != 0 && table[x][i + 1] != 4 && i + 1 < table.length) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[car2x][car2y];
                            int temp2 = table[car2x][car2y + 1];

                            while (car2y <= y && car2y + 1 <= y && car2y + 2 <= y) {
                                table[car2x][car2y + 2] = temp2;
                                table[car2x][car2y + 1] = temp;

                                table[car2x][car2y] = 0;
                                car2y++;

                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();

                        break;

                    case CAR3: //Vertical

                        System.out.print("\nEnter coordinates for the car to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new IllegalArgumentException("Negative coordinates");
                        }
                        if (y != car3y) {
                            throw new IllegalArgumentException("This car only moves up and down.");
                        }
                        if ((table[x][y] != 0 && table[x][y] != 5) || (table[x][y] != 0 && table[x + 1][y] != 5)) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if ((x == car3x)) {
                            throw new IllegalArgumentException("You're not moving at all!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the gameboard!");
                        }

                        //Something about shifting the array within the matrix.
                        if (x > car3x + 1) {

                            for (int i = car3x + 2; i <= x; i++) {
                                if (table[i][y] != 0 && table[i][y] != 5 || table[i][y + 1] != 0 && table[i][y + 1] != 5) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }

                            int temp = table[car3x][car3y];
                            int temp2 = table[car3x + 1][car3y];

                            while (car3x + 1 <= x && car3x + 2 <= x) {

                                table[car3x + 1][car3y] = temp;
                                table[car3x + 2][car3y] = temp2;

                                table[car3x][car3y] = 0;
                                car3x++;

                            }
                        }

                        if (x < (car3x)) {
                            //shift the array backwards now!!
                            int temp = table[car3x][car3y];
                            int temp2 = table[car3x + 1][car3y];

                            for (int i = car3x + 2; i <= x; i++) {
                                if (table[i][y] != 0 && table[i][y] != 5 || table[i][y + 1] != 0 && table[i][y + 1] != 5) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }

                            while (car3x - 1 >= x && (car3x - 1) >= x & (car3x - 1) >= 0) {
                                table[car3x][car3y] = temp2;

                                table[car3x - 1][car3y] = temp;

                                table[car3x + 1][car3y] = 0;
                                car3x--;
                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();

                        break;

                    case MAIN: //Horizontal

                        System.out.print("Enter coordinates for the car to move (row, then column: BE CAREFUL HERE!!): ");
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x < 0 || y < 0) {
                            throw new IllegalArgumentException("Negative coordinates.");
                        }
                        if (x != mainCarx) {
                            throw new IllegalArgumentException("This car only moves left and right.");
                        }

                        if ((table[x][y] != 0 && table[x][y] != 7)) {
                            throw new IllegalArgumentException("Something exists here already.");
                        }
                        if (y == mainCary) {
                            throw new IllegalArgumentException("You're not moving anywhere!!");
                        }
                        if (x >= table.length || y >= table.length) {
                            throw new ArrayIndexOutOfBoundsException("You're going beyond the game-board!");
                        }

                        //This if statement and the one below it shift the numbers belonging to truck2 (ideally, any index with a "2" in it) either left or right.
                        /*
                        Temporary variables are used to keep track of swapping, although direct shifting would probably be a bit better...

                        NAH, this makes things cleaner for me
                         */
                        if (y < mainCary - 1) {

                            for (int i = mainCary - 2; i >= y; i--) {
                                if (table[x][i] != 0 && table[x][i] != 7 || table[x][i - 1] != 0 && table[x][i - 1] != 7) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[mainCarx][mainCary];
                            int temp2 = table[mainCarx][mainCary - 1];

                            while (mainCary >= y && mainCary - 1 >= y) {
                                table[mainCarx][mainCary - 1] = temp;
                                table[mainCarx][mainCary - 2] = temp2;

                                table[mainCarx][mainCary] = 0;
                                mainCary--;

                            }
                        }

                        if (y > mainCary) {

                            for (int i = mainCary + 1; i <= y && i + 1 <= y; i++) {
                                if (table[x][i] != 0 && table[x][i] != 7 || table[x][i + 1] != 0 && table[x][i + 1] != 7) {
                                    throw new IllegalArgumentException("Something exists on this path already!");
                                }

                            }
                            int temp = table[mainCarx][mainCary];
                            int temp2 = table[mainCarx][mainCary - 1];

                            while (mainCary <= y && mainCary + 1 <= y) {
                                table[mainCarx][mainCary] = temp2;
                                table[mainCarx][mainCary + 1] = temp;

                                table[mainCarx][mainCary - 1] = 0;
                                mainCary++;

                            }
                        }

                        System.out.println("The updated board is as follows: ");

                        printBoard();

                        break;

                    default:
                        if (s.equalsIgnoreCase("exit")) {
                            System.out.println("Exiting the game. Have a nice day!");
                            System.exit(0);
                        }

                }

                if (table[2][table.length - 1] == 7) { //7 represents the car number that is the main car

                    System.out.println("You win!! Goodbye!");
                    break;
                }

                turnCount++;

            } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage() + " You lose a turn");
                turnCount++;

            }

        }

        if (turnCount >= 9) {

            System.out.println("Turn count: " + (turnCount + 1));
            System.out.println("You lose, sorry! Goodbye!");
        }

        System.exit(0);

    }

}
