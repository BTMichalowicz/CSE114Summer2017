package lab06;


/*
 * Benjamin Michalowicz (SBU ID: 110982339)
 * Lab 6: part 2: Locker Puzzle
 */
public class LockerPuzzle {
	

	public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; //For readability for the locker #'s
        
     


        //open every locker for every multiple of i
        for (int i = 0; i <lockers.length; i++) {
            for (int j = i; j<lockers.length; j+=i+1) {
                lockers[j] = !(lockers[j]); //Negates whatever boolean value is the locker
            }
        }

        //Display the indices of the open lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("locker " + (i+1) + " is open.");
            }
        }
    }
}
