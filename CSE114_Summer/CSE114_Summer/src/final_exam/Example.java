package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class Example {

    public static void main(String[] args) {
        new ClassA();
        System.out.println();
        new ClassB();
    }
}

class ClassA {

    protected ClassA() {
        this("Vandelay Industries");
        System.out.println("Kramerica");
    }

    protected ClassA(String s) {
        super();
        System.out.println(s);
    }
}

class ClassB extends ClassA {

    public ClassB() {
        
        //Implicit call to superclass constructor
        this("Tyler Chicken");
        System.out.println("News Seeker");
    }

    public ClassB(String s) {
        this(s, "NYC Systems");
        System.out.println(s);
    }

    public ClassB(String s1, String s2) {
        // super();
        System.out.println(s2);
    }
}
