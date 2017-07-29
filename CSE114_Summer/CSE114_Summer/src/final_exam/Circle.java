package final_exam;

/**
 *
 * @author Ben Michalowicz
 */
public class Circle implements Cloneable, Comparable {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {

        setRadius(radius);

    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        
        Circle c1 = (Circle)super.clone();
        
        return c1;
        
    }
    
    @Override
    public int compareTo(Object o){
        if(!(o instanceof Circle)){
            return -100;
        }
        
        Circle that = (Circle)o;
        
        return (int)(this.radius-that.radius);
    }

    public double getArea() {
        return radius * radius * 3.14159;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("No negative radii");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "A circle of radius: " + radius;
    }
    
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        
        if(!(o instanceof Circle)) return false;
        
        Circle that = (Circle)(o);
        
        
        return this.radius == that.radius;
    }
}
