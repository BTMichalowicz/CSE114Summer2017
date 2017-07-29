package lab09;










import java.util.Scanner;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 9, Parts 1, 3, 4, 5: All the Geometric Object Testings
public class GeoObjectTest {

    public static void main(String[] args) {

        System.out.print("Lab 9, Part 1: ");
        System.out.println("Lab-Question with defined sides:\n");
        Triangle t = new Triangle(1, 1.5, 1);
        t.setColor("Yellow");
        t.setFilled(true);

        System.out.println(t.toString());

        System.out.println("\nUser-defined Triangle:\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = sc.nextDouble();

        System.out.print("Enter the triangle's color: ");
        String color = sc.next();

        System.out.print("Enter if the triangle is filled or not: ");
        String str = sc.next();
        boolean filled = (str.equalsIgnoreCase("yes"));

        Triangle tri = new Triangle(side1, side2, side3);
        tri.setFilled(filled);
        tri.setColor(color);
        System.out.println(tri.toString());

        System.out.println();
        System.out.println();
        System.out.println("Lap 9, Part 3: Colorable Testing:\n");

        GeometricObject[] geos = new GeometricObject[5];

        geos[0] = new Triangle(3, 4, 5);
        geos[1] = new Square();
        geos[2] = new Triangle();
        geos[3] = new Square(5);
        geos[4] = new Square(6);

        for (int i = 0; i < geos.length; i++) {
            if (geos[i] instanceof Colorable) {
                System.out.println("The Geometric Object at index " + i + " is Colorable");
                ((Colorable) geos[i]).howToColor();
            }
        }

        System.out.println("\nLab 9, Part 4: Comparable Testing:\n\n"
                + "Beause the instructions mentioned to \"Implement the new GeometricObject class, \"\n"
                + "these objects come from a modified GeometricObject class compared to the variant in parts 1 and 3");

        System.out.println("Comparing two Circle objects: \n");

        Circle c1 = new Circle(4.3);

        Circle c2 = new Circle(8.32);

        System.out.println("The larger of the two circles (one of radius " + c1.getRadius() + " and one of radius " + c2.getRadius()
                + ") is the circle of radius " + ((Circle) GeometricObject.max(c1, c2)).getRadius() + " and area " + ((Circle) GeometricObject.max(c1, c2)).getArea());

        System.out.println("\nComparison of two Rectangle Objects: \n");

        Rectangle rect1 = new Rectangle(4, 7);
        Rectangle rect2 = new Rectangle(5, 6);

        System.out.println("The larger of the two rectangles (one with width " + rect1.getWidth() + " and height " + rect1.getHeight() + " and the other with " + rect2.getWidth()
                + " and height " + rect2.getHeight() + " is the rectangle of dimensions " + ((Rectangle) (GeometricObject.max(rect1, rect2))).getWidth() + " x " + ((Rectangle) (GeometricObject.max(rect1, rect2))).getHeight() + " and an area of "
                + ((Rectangle) (GeometricObject.max(rect1, rect2))).getArea());

        System.out.println("\nLab 9, Part 5: Geometric Object Implements Cloneable:\n");

        GeometricObject r1 = new Rectangle(54, 3);
        r1.setColor("Orange");
        r1.setFilled(false);

        
        try{
            GeometricObject r2 = (Rectangle)(r1.clone());
            System.out.println("The original:\n");
            System.out.println(r1.toString());
            System.out.println("\nThe clone:");
            System.out.println(r2.toString());

        } catch (Exception ex) {
            System.out.println("Clone not supported");
        }

    }

}
