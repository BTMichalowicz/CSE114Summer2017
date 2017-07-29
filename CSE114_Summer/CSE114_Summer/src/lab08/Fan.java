package lab08;


//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 8, Part 1: Fan Class


public class Fan {

    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;

    public int getSpeed() {
        return speed;
    }

    
    
    public void setSpeed(int speed) {

        if (speed == Fan.SLOW || speed == Fan.MEDIUM || speed == Fan.FAST) {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int speed = Fan.SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {

    }

    @Override
    public String toString() {
        if (isOn()) {
            return "A " + this.getRadius() + " inch " + this.getColor() + " fan at a speed of " + this.getSpeed();
        } else {
            return "A " + this.getRadius() + " inch " + this.getColor() + " fan; fan is off";
        }
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(Fan.FAST);
        f1.setOn(true);
        f1.setRadius(10.0);
        f1.setColor("yellow");

        System.out.println(f1.toString());

        Fan f2 = new Fan();
        f2.setSpeed(MEDIUM);
        System.out.println(f2.toString());
    }

}
