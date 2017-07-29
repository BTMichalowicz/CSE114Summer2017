/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class Test {

    public static void main(String[] args) {
        B b = new B();
        b.m(5);

        System.out.println("i is " + b.i);

        new Human().printHuman();
        new Student().printHuman();
    }

}

class A {

    int i;

    public void m(int i) {
        this.i = i;
    }
}

class B extends A {

    public void m(String s) {
    }
}

class Human {

    private String getInfo() {
        return "Human";
    }

    public void printHuman() {
        System.out.println(getInfo());
    }
}

class Student extends Human {

    private String getInfo() {
        return "Student";
    }
}
