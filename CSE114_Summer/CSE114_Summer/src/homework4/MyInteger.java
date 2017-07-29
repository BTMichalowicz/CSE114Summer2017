package homework4;








//Benjamin Michalowicz
//Homework 4, Part1: MyInteger class
import java.util.Scanner;

public class MyInteger {

    private int value;

    public int getValue() {
        return this.value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isOdd() {
        return (this.value % 2 != 0);
    }

    public boolean isEven() {
        return (this.value % 2 == 0);
    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public boolean isPrime() {

        if (this.value == 1) {
            return false;
        }
        for (int i = 2; i < this.value; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isEven(MyInteger i) {
        return (i.isEven());
    }

    public static boolean isOdd(MyInteger i) {
        return i.isOdd();
    }

    public static boolean isPrime(MyInteger i) {
        return i.isPrime();
    }

    public boolean equals(int num) {
        
        return this.getValue() == num;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(!(o instanceof MyInteger)) {
            return false;
        }
        
        MyInteger myInt = (MyInteger) o;
        
        return this.equals(myInt.getValue());
        
    }

    

    public static int parseInt(char[] arr) {
        double value = 0;
        int power = arr.length - 1; //Last index of the array

        
        for(char c: arr){
            if(!Character.isDigit(c)){
                throw new IllegalArgumentException("Bad input");
            }
        }
        for (char c : arr) {
            value += Math.pow(10, power) * (c - '0');
            power--;
        }

        return (int) value;

    }

    public static int parseInt(String str) {

        return MyInteger.parseInt(str.toCharArray());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyInteger obj0;

        //Creating the object itself plus test
        System.out.print("Enter a positive integer to create a MyInteger object or <enter> or zero/any negative number to move on to next part of program:");
        String number = sc.nextLine();
        int value;
        if (!number.equals("")) {
            value = Integer.parseInt(number);

            while (value > 0) {

                obj0 = new MyInteger(value);

                System.out.println("MyInteger obj0 = new MyInteger(" + value + ");");

                System.out.println("obj0.getValue() = " + obj0.getValue());
                System.out.println("obj0.isEven() = " + obj0.isEven());
                System.out.println("obj0.isOdd() = " + obj0.isOdd());
                System.out.println("obj0.isPrime() = " + obj0.isPrime());

                System.out.print("Enter a positive integer to create a MyInteger object or <enter> or zero/any negative number to move on to the next part of program:");
                number = sc.nextLine();
                if (number.equals("")) {
                    break;
                }

                value = Integer.parseInt(number);

            }
        }

        //Testing all the non-static methods aside from equals(...)
        System.out.print("Enter a positive integer to test static isXXX(int) methods or <enter> or zero/any negative number to move on to next part of program:");
        number = sc.nextLine();

        if (!number.equals("")) {
            value = Integer.parseInt(number);

            while (value > 0) {
                System.out.println("MyInteger.isEven(" + value + ") = " + MyInteger.isEven(value));
                System.out.println("MyInteger.isOdd(" + value + ") = " + MyInteger.isOdd(value));
                System.out.println("MyInteger.isPrime(" + value + ") = " + MyInteger.isPrime(value));
                System.out.print("Enter a positive integer to test static isXXX(int) methods or <enter> or zero/any negative number to move on to next part of program:");
                number = sc.nextLine();
                if (number.equals("")) {
                    break;
                }

                value = Integer.parseInt(number);

            }
        }

        //Testing all the static methods aside from equals(...)
        System.out.print("Enter a positive integer to test static isXXX(MyInteger) methods or <enter> or zero/any negative number to move on to next part of program:");

        number = sc.nextLine();
        MyInteger obj1;
        if (!number.equals("")) {
            value = Integer.parseInt(number);

            while (value > 0) {
                obj1 = new MyInteger(value);
                System.out.println("MyInteger obj1 = new MyInteger(" + value + ");");
                System.out.println("MyInteger.getValue(obj1) = " + obj1.getValue());
                System.out.println("MyInteger.isEven(obj1) = " + MyInteger.isEven(obj1));
                System.out.println("MyInteger.isOdd(obj1) = " + MyInteger.isOdd(obj1));
                System.out.println("MyInteger.isPrime(obj1) = " + MyInteger.isPrime(obj1));

                System.out.print("Enter a positive integer to test static isXXX(MyInteger) methods or <enter> or zero/any negative number to move on to next part of program:");
                number = sc.nextLine();
                if (number.equals("")) {
                    break;
                }

                value = Integer.parseInt(number);

            }
        }

        //First equals(int) method... this is a long one
        System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> or zero/any negative number to move on to next part of program:");

        number = sc.nextLine();
        MyInteger obj2;
        int val2;

        if (!number.equals("")) {
            value = Integer.parseInt(number);

            if (value > 0) {
                obj2 = new MyInteger(value);

                System.out.println("MyInteger obj2 = new MyInteger(" + value + ");");
                System.out.println("obj2.getValue() = " + obj2.getValue());
                System.out.print("Enter a the second of two positive integers to test obj2.equals(int) or <enter> or zero/any negative number to move on to next part of program:");
                number = sc.nextLine();

                if (!number.equals("")) {

                    val2 = Integer.parseInt(number);

                    while (value > 0 && val2 > 0) {
                        obj2 = new MyInteger(value);
                        System.out.println("obj2.equals(" + val2 + ") = " + obj2.equals(val2));

                        System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> or zero/any negative number to move on to next part of program:");

                        number = sc.nextLine();
                        if (number.equals("")) {
                            break;
                        }

                        value = Integer.parseInt(number);

                        if (!(value > 0)) {
                            break;
                        }

                        System.out.println("MyInteger obj2 = new MyInteger(" + value + ");");

                        System.out.println("obj2.getValue() = " + value);
                        System.out.print("Enter a the second of two positive integers to test obj2.equals(int) or <enter> or any zero/any negative number to move on to next part of program:");
                        number = sc.nextLine();
                        if (number.equals("")) {
                            break;
                        }

                        val2 = Integer.parseInt(number);

                        if (!(val2 > 0)) {
                            break;
                        }

                    }
                }

            }
        }

        //Now onto the second equals(MyInteger obj3)
        System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(My Integer obj3) or <enter> or zero/any negative number number to move on to next part of program:");
        sc = new Scanner(System.in);
        number = sc.nextLine();
        if (!number.equals("")) {

            value = Integer.parseInt(number);

            MyInteger obj3;

            if (value > 0) {
                obj2 = new MyInteger(value);

                System.out.println("MyInteger obj2 = new MyInteger(" + value + ");");
                System.out.println("obj2.getValue() = " + obj2.getValue());
                System.out.print("Enter a the second of two positive integers to create obj3 and test obj2.equals(My Integer obj3) or <enter> or zero/any negative number to move on to next part of program:");
                val2 = sc.nextInt();

                while (value > 0 && val2 > 0) {

                    obj2 = new MyInteger(value);
                    obj3 = new MyInteger(val2);
                    //Entire test case setup

                    System.out.println("MyInteger obj3 = new MyInteger(" + val2 + ");");
                    System.out.println("obj3.getValue() = " + obj3.getValue());

                    System.out.println("obj2.equals(obj3) = " + obj2.equals(obj3));
                    System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(My Integer obj3) or <enter> or zero/any negative number to move on to next part of program:");
                    sc = new Scanner(System.in);
                    number = sc.nextLine();
                    if (number.equals("")) {
                        break;
                    }

                    value = Integer.parseInt(number);

                    if (!(value > 0)) {
                        break;
                    }

                    System.out.println("MyInteger obj2 = new MyInteger(" + value + ");");

                    System.out.println("obj2.getValue() = " + value);
                    System.out.print("Enter the second of two positive integers to create obj3 and test obj2.equals(My Integer obj3) or <enter> or zero/any negative number to move on to next part of program:");
                   
                    sc = new Scanner(System.in);
                    number = sc.nextLine();
                    if (number.equals("")) {
                        break;
                    }

                    val2 = Integer.parseInt(number);

                    if (!(val2 > 0)) {
                        break;
                    }

                }
            }
        }

        //ParseInt(char[])
        System.out.print("Enter a positive integer that will be placed into a char[] to demonstrate the MyInteger.parseInt(char[]); pressing <enter> or zero/any negative number will move on to the next part:");

        number = sc.nextLine();
        if (!number.equals("")) {
            char[] chars = number.toCharArray();

            MyInteger obj4;

            while (MyInteger.parseInt(number) > 0) {
                obj4 = new MyInteger(MyInteger.parseInt(chars));

                System.out.println("MyInteger obj4 = new MyInteger(MyInteger.parseInt(chars);");
                System.out.println("obj4.getValue() = " + obj4.getValue());
                System.out.println("obj4.isEven() = " + obj4.isEven());
                System.out.println("obj4.isOdd() = " + obj4.isOdd());
                System.out.println("obj4.isPrime() = " + obj4.isPrime());

                System.out.print("Enter a positive integer that will be placed into a char[] to demonstrate the MyInteger.parseInt(char[]); pressing <enter> or zero/any negative number will move on to the next part:");

                number = sc.nextLine();

                if (number.equals("")) {
                    break;
                }

                chars = number.toCharArray();
            }
        }

        System.out.print("Enter a positive integer that will be placed into a String to demonstrate the MyInteger.parseInt(String); this is the last part, so pressing <enter> or zero/any negative number will end the program:");

        number = sc.nextLine();

        MyInteger obj5;

        if (!number.equals("")) {

            while (MyInteger.parseInt(number) > 0) {
                obj5 = new MyInteger(MyInteger.parseInt(number));
                System.out.println("MyInteger obj5 = new MyInteger(MyInteger.parseInt(number);");
                System.out.println("obj5.getValue() = " + obj5.getValue());
                System.out.println("obj5.isEven() = " + obj5.isEven());
                System.out.println("obj5.isOdd() = " + obj5.isOdd());
                System.out.println("obj5.isPrime() = " + obj5.isPrime());

                System.out.print("Enter a positive integer that will be placed into a String to demonstrate the MyInteger.parseInt(String); this is the last part, so pressing <enter> or zero/any negative number will end the program:");

                number = sc.nextLine();
                if (number.equals("")) {
                    break;
                }

                

            }
        }

    }

}
