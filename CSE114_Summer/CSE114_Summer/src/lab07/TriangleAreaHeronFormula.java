package lab07;





import java.util.Scanner;

//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 7, Part 1: Area of a triangle through Heron's formula
public class TriangleAreaHeronFormula {
    
    public static double getTriangleArea(double[][] points){
        
        double ax, ay, bx, by, cx, cy;
        
        double area =0;
        
        ax = points[0][0];
        bx = points[1][0];
        cx = points[2][0];
        
        ay = points[0][1];
        by = points[1][1];
        cy = points[2][1];
        
        
        
        double a, b, c;
        
        a = Math.sqrt((Math.pow(bx-ax,2))+(Math.pow(by-ay, 2)));
        b = Math.sqrt((Math.pow(cx-bx,2))+(Math.pow(cy-by, 2)));
        c = Math.sqrt((Math.pow(ax-cx,2))+(Math.pow(ay-cy, 2)));
        
        
        
        
        double s = (a+b+c)/2;
        
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        if(area>0.0000001){
            System.out.println("The points are on the same line.");
        }
        return area;
    }
    
    public static void main(String[] args) {
        
        double[][] arr = new double[3][2];
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (double[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextDouble();
            }
        }
        double area = getTriangleArea(arr);    
        System.out.printf("The area of the triangle is %.3f\n", area);
            
    }
    
}
