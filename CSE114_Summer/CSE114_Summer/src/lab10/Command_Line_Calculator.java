package lab10;



//Benjamin Michalowicz(SBU ID: 110982339)
//Lab 10, Part 1: Command-Line Calculator
public class Command_Line_Calculator {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Java Command_Line_Calculator operand1 operator operand2");
        }

        int res = 0;
        try {
            
            
            switch (args[1].charAt(0)) {
                case '+':
                    res = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    res = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    res = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':

                    if (Integer.parseInt(args[2]) == 0) {
                        throw new IllegalArgumentException();
                    }
                    res = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;

            }

            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
