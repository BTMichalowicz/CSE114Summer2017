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
public class Circle {
    
    private double radius = 1;
    
    private static int numberOfObjects;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    
    
    public Circle(){
        this(1);
        numberOfObjects++;
    }
    
    public Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
    }
    
    public double getArea(){
        return radius*radius*3.14159;
    }


    public static void main(String[] args) {
        Circle[] s = new Circle[10];
        
        for(int i = 0; i<s.length; i++){
            s[i] = new Circle(i+1);
            
            System.out.println(s[i].getArea());
        }
    }
    
    
    
    
    
    
    
}
