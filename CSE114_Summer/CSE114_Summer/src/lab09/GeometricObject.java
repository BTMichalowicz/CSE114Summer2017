package lab09;



import java.util.Date;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 9, Parts 1, 3, 4, 5: GeometricObject.java
interface Colorable {

    public void howToColor();
}

//The .java file is called GeometricObject.java, as Triangle will be a subclass
//within the GeometricObject.java file. Plus, it helps with less files being run.
/**
 *
 * @author Ben Michalowicz
 */
public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this("blue", false);
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        try {
            GeometricObject result = (GeometricObject) (super.clone());
            result.dateCreated = (Date) (dateCreated.clone());
            return result;
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }

    @Override
    public String toString() {

        return "Created on " + dateCreated + " \ncolor: " + color + "\nFilled?: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject that) {

        return this.getArea() > that.getArea() ? 1 : this.getArea() < that.getArea() ? -1 : 0;

    }

    public static GeometricObject max(GeometricObject this1, GeometricObject that1) {

        return (this1.compareTo(that1) >= 0 ? this1 : that1);
    }

}

//Subclass of GeometricObject
class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {

        String s = "";

        s += "Triangle: \nSide 1: " + side1 + "\nSide 2: " + side2 + "\nSide 3: " + side3;
        s += "\nArea: " + getArea();
        s += "\nPerimeter: " + getPerimeter();
        s += "\n" + super.toString();

        return s;

    }

}

//Square subclass of GeometricObject
class Square extends GeometricObject implements Colorable {

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {

        System.out.println("To color in a square:\nColor the edges, and then shade in the middle.");
    }

    @Override
    public String toString() {
        String s = "A square of side length " + this.getSide() + " and an area of " + this.getArea();
        return s + "\n" + super.toString();
    }

}

//Circle class that extends GeometricObject for Lab 9, Part 4
class Circle extends GeometricObject {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("No negative numbers for a radius");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //Erm... make that Circumference
    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle of radius " + this.getRadius() + " and area " + this.getArea() + "\n" + super.toString();
    }

}

class Rectangle extends GeometricObject {

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width, height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;

    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    @Override
    public String toString() {
        return "A rectangle of width " + this.width + " and height " + this.height + "; it has a perimeter of " + this.getPerimeter() + " and area " + this.getArea() + "\n" + super.toString();
    }

}
