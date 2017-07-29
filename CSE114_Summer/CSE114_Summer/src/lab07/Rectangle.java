package lab07;



//Benjamin Michalowicz (SBU ID: 110982339)
//Lab 7, part 2: Rectangle Class
public class Rectangle{
	private double width;
	private double height;
	
	public Rectangle(){
		this(1, 1);
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return width*height;
	}
	
	public double getPerimeter(){
		return 2*(width+height);
	}
        
        public double getWidth(){ return width;}
        public double getHeight(){ return height;}
        public void setHeight(double height){ this.height = height;}
        public void setWidth(double width){this.width = width;}
        
        
        @Override
        public String toString(){
            
            
            String str = "A rectangle of "  + this.getWidth() + " width and " + this.getHeight() + " height. \nIt has a perimeter of " + this.getPerimeter() + " and an area of " + this.getArea();
            
            return str;
        }
        
        @Override
        public boolean equals(Object o){
           if(o==this) {
               return true;
           }
           
           if(!(o instanceof Rectangle)) {
               return false;
           }
           
           Rectangle that = (Rectangle) o;
           
           return this.width==that.width && this.height==that.height;
        }
	
	
	public static void main(String[] args){
		
            Rectangle rectangle1 = new Rectangle(4.0, 40.0);
            System.out.println(rectangle1.toString());
		
            Rectangle rectangle2 = new Rectangle(3.5, 35.9);
            System.out.println(rectangle2.toString());
            
            
            System.out.println("These rectangles are " + (rectangle1.equals(rectangle2)? "equal" : "not equal"));
	}

   
    
    
    
}
