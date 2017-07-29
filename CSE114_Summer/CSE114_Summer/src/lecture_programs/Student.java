/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

/**
 *
 * @author Ben Michalowicz
 */
public class Student {
    
    private String name;
    private int age;
    private boolean isScienceMajor;
    private char gender;
    
    
    public static void main(String[] args) {
        Student s = new Student();
        
        
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.isScienceMajor);
        System.out.println(s.gender); // prints out \u0000
    }
    
}
