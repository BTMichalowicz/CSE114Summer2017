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
public class Rectangle {
    private double width, height;
    
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        return 2*(width+height);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    
    public Rectangle(){this (1, 1);}
    
    
    
    
    
    
    
}



class ComparableRectangle extends Rectangle implements Comparable{
    
    
    @Override
    public int compareTo(Object o){
        
        ComparableRectangle c = (ComparableRectangle) o;
        
        return (this.getArea()>c.getArea()?1:this.getArea()<c.getArea()?0:1);
    }
}

