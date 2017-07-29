package lab10;



//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 10, Part 2: Illegal Triangle Exception

import java.util.Scanner;

class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class IllegalTriangle {

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        if(side1>0){
        this.side1 = side1;
        }else{
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException{
        if(side2>0){
        this.side2 = side2;
        }else{
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException{
        if(side3>0){
        this.side3 = side3;
        }else{
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        
        }
    }

    private double side1, side2, side3;
    
    public double getArea(){
        double s = (side1+side2+side3)/2;
        
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        
        
    }
    
    public double getPerimeter(){
        return side1+side2+side3;
    }

    public IllegalTriangle(double side1, double side2, double side3) throws IllegalTriangleException {

       
        if (side1 >= side2 + side3) {
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        } else if (side2 >= side1 + side3) {
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        } else if (side3 >= side2 + side1) {
            throw new IllegalTriangleException("The sum of two sides cannot be smaller than the third side.");
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides for a triangle: ");

        double side1 = sc.nextDouble(), side2 = sc.nextDouble(), side3 = sc.nextDouble();

        IllegalTriangle tri = new IllegalTriangle(side1, side2, side3);

        System.out.println("The sides of the triangle are " + tri.side1 + ", "
                + tri.side2 + ", " + tri.side3);
    }

}
